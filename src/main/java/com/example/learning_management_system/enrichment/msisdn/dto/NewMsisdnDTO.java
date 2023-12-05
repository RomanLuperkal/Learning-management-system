package com.example.learning_management_system.enrichment.msisdn.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewMsisdnDTO {
    private String action;
    private String page;
    //todo валидация msisdn
    private Long msisdn;
}
