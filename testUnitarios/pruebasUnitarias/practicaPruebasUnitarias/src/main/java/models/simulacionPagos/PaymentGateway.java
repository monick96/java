package models.simulacionPagos;

public interface PaymentGateway {
    //firma metodo
    PaymentResponse requestPayment(PaymentRequest request);
}
