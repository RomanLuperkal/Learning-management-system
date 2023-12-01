package com.example.learning_management_system.model.enrichment;

import com.example.learning_management_system.model.Message;

@FunctionalInterface
public interface Enrichment {
    String enrichMessage(Message message);
}
