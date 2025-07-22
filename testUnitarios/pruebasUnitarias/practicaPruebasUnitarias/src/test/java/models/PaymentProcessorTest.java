package models;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    @Test
    public void paymentIsOK(){

        //simulamos un payment gateway
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        //pasamos la simulacion al processor
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);


        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);
    }


    @Test
    public void paymentIsFails(){

        //simulamos un payment gateway
        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);

        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        //pasamos la simulacion al processor
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);


        boolean result = paymentProcessor.makePayment(1000);

        assertFalse(result);
    }

}