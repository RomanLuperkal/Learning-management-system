package com.example.learning_management_system.repository.user;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    String getUserFullname(Long msisdn) throws Exception;
}
