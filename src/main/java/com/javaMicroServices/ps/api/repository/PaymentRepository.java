package com.javaMicroServices.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaMicroServices.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
