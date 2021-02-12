package br.ecommerce.payment.listener;

import br.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.ecommerce.checkout.event.PaymentCreatedEvent;
import br.ecommerce.payment.streaming.CheckoutProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class CheckoutCreatedListener {

    private final CheckoutProcessor checkoutProcessor;

    @StreamListener(CheckoutProcessor.INPUT)
    public void handler(Message<?> message){
        //gateway payment process
        //persist payment data
        // send the event of the executed payment
        final PaymentCreatedEvent paymentCreatedEvent = PaymentCreatedEvent.newBuilder()
                //.setCheckoutCode(message.getCheckoutCode())
                //.setCheckoutStatus(message.getStatus())
                .setPaymentCode(UUID.randomUUID().toString())
                .build();
        checkoutProcessor.output().send(MessageBuilder.withPayload(paymentCreatedEvent).build());
    }
}
