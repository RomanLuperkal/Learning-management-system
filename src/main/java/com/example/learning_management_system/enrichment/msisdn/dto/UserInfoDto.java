package com.example.learning_management_system.enrichment.msisdn.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfoDto {
    private String firstName;
    private String lastName;
}
