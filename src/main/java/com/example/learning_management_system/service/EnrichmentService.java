package com.example.learning_management_system.service;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.model.enrichment.Enrichment;
import com.example.learning_management_system.validator.MessageValidator;
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
public class EnrichmentService {

    private final Map<String, Enrichment> enrichmentImpl;
    @Getter
    private final List<Message> processedMessages = Collections.synchronizedList(new ArrayList<>());
    @Getter
    private final List<Message> unprocessedMessages = Collections.synchronizedList(new ArrayList<>());

    public String enrich(Message message) {
        if (MessageValidator.validMessage(message)) {

        }
        return "";
    }
}
