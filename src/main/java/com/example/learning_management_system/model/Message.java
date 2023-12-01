package com.example.learning_management_system.model;

import lombok.Data;

@Data
public class Message {
    private String content;
    private EnrichmentType enrichmentType;

    public enum EnrichmentType {
        MSISDN, QWE;
    }
}
