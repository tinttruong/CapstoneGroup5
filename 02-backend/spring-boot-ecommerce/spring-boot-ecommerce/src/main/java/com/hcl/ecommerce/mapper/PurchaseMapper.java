package com.hcl.ecommerce.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.hcl.ecommerce.dto.PurchaseDto;
import com.hcl.ecommerce.entity.Purchase;

@Mapper
public interface PurchaseMapper {
	
	PurchaseMapper INSTANCE = Mappers.getMapper(PurchaseMapper.class);
	
	@Mapping(source = "strEnt", target = "strDto")
	PurchaseDto toDto(Purchase purch);
	
}
