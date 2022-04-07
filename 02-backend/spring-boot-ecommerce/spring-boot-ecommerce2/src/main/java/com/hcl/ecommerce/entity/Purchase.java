package com.hcl.ecommerce.entity;

import java.util.Set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Purchase {
	
	private Customer customer;
	
	private Address shippingAddress;
	
	private Address billingAddress;
	
	private Order order;
	
	private Set<OrderItem> orderItems;

	private String strEnt;
}
