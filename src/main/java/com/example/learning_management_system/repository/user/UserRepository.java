package com.example.learning_management_system.repository.user;

import com.example.learning_management_system.exception.UserNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    String getUserFullname(Long msisdn) throws UserNotFoundException;
}
