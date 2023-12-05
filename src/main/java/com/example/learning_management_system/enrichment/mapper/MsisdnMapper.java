package com.example.learning_management_system.enrichment.mapper;

import com.example.learning_management_system.enrichment.msisdn.dto.UpdatedMsisdnDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MsisdnMapper {
    UpdatedMsisdnDTO mapToUpdatedMsisdnDto(String string);
}
