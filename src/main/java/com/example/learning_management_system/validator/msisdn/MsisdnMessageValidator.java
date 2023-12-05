package com.example.learning_management_system.validator.msisdn;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.validator.MessageValidator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("MSISDN")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public abstract class MsisdnMessageValidator implements MessageValidator {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Boolean validMessage(Message message) {
        return isValidJson(message.getContent());
    }

    private  Boolean isValidJson(String content) {
        try {
            JsonNode json = objectMapper.readTree(content);
            return isKeyFieldsValid(json);
        } catch (Exception e) {
            return false;
        }
    }

    private  Boolean isKeyFieldsValid(JsonNode json) {
        return Arrays.stream(Message.EnrichmentType.values()).map(Enum::toString)
                .anyMatch(typeName -> json.get(typeName) != null && json.get(typeName).isLong()) && json.get("action") != null
                && json.get("page") != null;
    }
}
