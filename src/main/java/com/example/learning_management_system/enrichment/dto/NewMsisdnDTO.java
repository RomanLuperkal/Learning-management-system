package com.example.learning_management_system.enrichment.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewMsisdnDTO {
    //todo дописать классы дто
    private String action;
    private String page;
    //todo валидация msisdn
    private Long msisdn;
}
