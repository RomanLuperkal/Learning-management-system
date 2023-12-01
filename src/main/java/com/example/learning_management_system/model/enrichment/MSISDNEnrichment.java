package com.example.learning_management_system.model.enrichment;

import com.example.learning_management_system.model.Message;
import org.springframework.stereotype.Component;

@Component("MSISDN")
public class MSISDNEnrichment implements Enrichment {

    @Override
    public String enrichMessage(Message message) {
        return null;
    }
}
