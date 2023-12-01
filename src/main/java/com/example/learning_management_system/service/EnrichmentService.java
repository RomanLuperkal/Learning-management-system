package com.example.learning_management_system.service;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.model.enrichment.Enrichment;
import com.example.learning_management_system.validator.MessageValidator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Getter
public class EnrichmentService {

    private final Map<String, Enrichment> enrichmentImpl;

    public String enrich(Message message) {
        if (MessageValidator.validMessage(message)) {

        }
        return "";
    }
}
