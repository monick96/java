package models.simulacionPagos;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        boolean result = false;
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(amount));

        if (response.getPaymentStatus() == PaymentResponse.PaymentStatus.OK) {
            result = true;
        }
        return result;
    }


}
