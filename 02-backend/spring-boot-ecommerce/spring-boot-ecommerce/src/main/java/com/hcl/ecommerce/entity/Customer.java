package com.hcl.ecommerce.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Properties of an order's Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@OneToMany(mappedBy = "customer", cascade=CascadeType.ALL)
	private Set<Order> orders;
	
	public void add(Order order) {
		
		if (order != null) {
			if(orders == null) {
				orders = new HashSet<>();
			}
			orders.add(order);
			order.setCustomer(this);
		}
	}
}
