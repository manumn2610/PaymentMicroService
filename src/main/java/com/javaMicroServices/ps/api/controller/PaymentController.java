package com.javaMicroServices.ps.api.controller;

import java.util.Properties;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaMicroServices.ps.api.entity.Payment;
import com.javaMicroServices.ps.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService service;
	
	@Value ("${server.port}")
	private String port;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		System.out.println("Payment Processed by Payment Port----->"+port);
		payment.setPort(port);
		return service.doPayment(payment);

	}

	

}
