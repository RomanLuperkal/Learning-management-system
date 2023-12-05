package com.example.learning_management_system.enrichment.msisdn.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UpdatedMsisdnDTO {
    private String action;
    private String page;
    private Long msisdn;
    private UserInfoDto enrichment;
}
