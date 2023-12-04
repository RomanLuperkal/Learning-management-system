package com.example.learning_management_system.model.enrichment;

import com.example.learning_management_system.model.Message;
import com.example.learning_management_system.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MSISDN")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MSISDNEnrichment implements Enrichment {
    private final UserRepository userRepository;

    @Override
    public String enrichMessage(Message message) {
        //todo реализовать логику обогощения json
        return null;
    }
}
