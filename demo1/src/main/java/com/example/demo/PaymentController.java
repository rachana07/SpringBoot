package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/id")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @GetMapping("/type")
    public List<Payment> getPaymentsByType(@PathVariable PaymentType type){
        return paymentService.getPaymentByType(type);
    }

    @GetMapping
    public List<Payment> getPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping
    public Payment createPayment(@RequestBody Payment payment){
        return paymentService.setPayment(payment);
    }
}
