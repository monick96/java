package models;

import models.simulacionPagos.PaymentGateway;
import models.simulacionPagos.PaymentProcessor;
import models.simulacionPagos.PaymentResponse;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    PaymentGateway paymentGateway;
    PaymentProcessor paymentProcessor;

    public void setup(){

        //simulamos un payment gateway
        paymentGateway = Mockito.mock(PaymentGateway.class);

        //pasamos la simulacion al processor
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void paymentIsOK(){

        setup();

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);
    }


    @Test
    public void paymentIsFails(){
        setup();

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }

}