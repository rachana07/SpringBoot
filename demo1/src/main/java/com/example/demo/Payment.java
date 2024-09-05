package com.example.demo;

public class Payment {

    Long id;
    double amount;
    PaymentType paymentType;

    Payment(Long id, double amount, PaymentType paymentType) {
        this.id = id;
        this.amount = amount;
        this.paymentType = paymentType;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
