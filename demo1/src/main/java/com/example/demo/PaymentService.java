package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentService  {

    HashMap<Long, Payment> map = new HashMap<>();

    public Payment setPayment(Payment payment) {
        Long id = 1L;
        payment.setId(id+1);
        map.put(payment.getId(), payment);
        return payment;
    }

    public List<Payment> getAllPayments(){
        return new ArrayList<>(map.values());
    }

    public Payment getPaymentById(Long id){
        return map.values().stream().filter(payment -> id.equals(payment.getId())).findFirst().orElse(null);
    }

    public List<Payment> getPaymentByType(PaymentType paymentType){
        return map.values().stream().filter(payment -> paymentType.equals(payment.getPaymentType())).collect(Collectors.toList());
    }

}
