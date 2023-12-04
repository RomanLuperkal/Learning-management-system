package com.example.learning_management_system.enrichment.service;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.model.enrichment.Enrichment;
import com.example.learning_management_system.validator.MessageValidator;
import com.example.learning_management_system.validator.msisdn.MsisdnMessageValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EnrichmentServiceImpl implements EnrichmentService{

    private final Map<String, Enrichment> enrichmentImpl;
    private final Map<String, MessageValidator> validators;
    @Getter
    private final List<Message> processedMessages = Collections.synchronizedList(new ArrayList<>());
    @Getter
    private final List<Message> unprocessedMessages = Collections.synchronizedList(new ArrayList<>());


    @Override
    public String enrich(Message message) {
        final String enrichmentType = message.getEnrichmentType().toString();
        final MessageValidator validator = validators.get(enrichmentType);
        if (validator.validMessage(message)) {
            Enrichment enrichment = enrichmentImpl.get(enrichmentType);
            return enrichment.enrichMessage(message);
        }
        return "";
    }
}
