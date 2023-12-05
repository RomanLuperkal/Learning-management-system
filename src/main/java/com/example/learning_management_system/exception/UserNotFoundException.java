package com.example.learning_management_system.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotFoundException extends Exception {
    private String message;
}
