package com.hcl.ecommerce.service;

import com.hcl.ecommerce.dto.PaymentInfo;
import com.hcl.ecommerce.dto.PurchaseDto;
import com.hcl.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
	
	PurchaseResponse placeOrder(PurchaseDto purchase);
	
	PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
