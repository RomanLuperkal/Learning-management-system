package com.example.learning_management_system.model.enrichment;

import com.example.learning_management_system.enrichment.mapper.MsisdnMapper;
import com.example.learning_management_system.enrichment.msisdn.dto.UpdatedMsisdnDTO;
import com.example.learning_management_system.exception.UserNotFoundException;
import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.repository.user.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("MSISDN")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MSISDNEnrichment implements Enrichment {
    private final UserRepository userRepository;
    private final MsisdnMapper mapper;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String enrichMessage(Message message) {
        UpdatedMsisdnDTO enrichJson = mapper.mapToUpdatedMsisdnDto(message.getContent());
        try {
            String fullNameUser = userRepository.getUserFullname(enrichJson.getMsisdn());
            Pair<String, String> s ;
            Arrays.stream(fullNameUser.split(" ")).forEach((element, index) -> {
                if (index.equals(0)) {
                   enrichJson.getEnrichment().setLastName(element);
                } else {
                    enrichJson.getEnrichment().setFirstName(element);
                }

            });

        } catch (UserNotFoundException e) {
            //todo логика обогащения в случае отсутсвия юзера по msisdn
        }

        enrichJson.setEnrichment();

        return null;
    }
}
