package models;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
