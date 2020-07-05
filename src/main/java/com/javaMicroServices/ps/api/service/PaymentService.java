package com.javaMicroServices.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.apache.tomcat.util.buf.UDecoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaMicroServices.ps.api.entity.Payment;
import com.javaMicroServices.ps.api.repository.PaymentRepository;

@Repository
public class PaymentService {

	@Autowired
	PaymentRepository repository;

	public Payment doPayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		return repository.save(payment);
	}
	
public String paymentProcessing() {
		
		return new Random().nextBoolean()?"success":"false";

	}

}
