package com.hcl.ecommerce.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PurchaseResponseEnt {
	
	private final String orderTrackingNum;
}
