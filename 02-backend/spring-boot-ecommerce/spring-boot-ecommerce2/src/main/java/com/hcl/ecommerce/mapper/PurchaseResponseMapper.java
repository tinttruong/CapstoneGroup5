package com.hcl.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.hcl.ecommerce.dto.PurchaseResponse;
import com.hcl.ecommerce.entity.PurchaseResponseEnt;

@Mapper
public interface PurchaseResponseMapper {
	
	PurchaseResponseMapper INSTANCE = Mappers.getMapper(PurchaseResponseMapper.class);
	
	@Mapping(source = "orderTrackingNum", target = "orderTrackingNumber")
	PurchaseResponse toDto(PurchaseResponseEnt purchResp);
	
}
