package com.example.learning_management_system.validator;

import com.example.learning_management_system.model.Message;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;



public abstract class MessageValidator {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Boolean validMessage(Message message) {
        return isValidJson(message.getContent());
    }

    private static Boolean isValidJson(String content) {
        try {
            JsonNode json = objectMapper.readTree(content);
            return isEnrichmentFieldExists(json);
        } catch (Exception e) {
            return false;
        }
    }

    private static Boolean isEnrichmentFieldExists(JsonNode json) {
        return Arrays.stream(Message.EnrichmentType.values()).map(Enum::toString)
                .anyMatch(typeName -> json.get(typeName) == null);
    }
}
