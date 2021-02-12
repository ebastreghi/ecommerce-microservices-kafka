package br.ecommerce.payment.service;


import br.ecommerce.checkout.event.CheckoutCreatedEvent;
import br.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
