package com.ednilsonrossi.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.ednilsonrossi.hrpayroll.model.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		//TODO recuperar dados do trabalhador
		return new Payment("Ednilson", 200.0, days);
	}
	
}
