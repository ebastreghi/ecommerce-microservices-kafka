package br.ecommerce.checkout.service;


import br.ecommerce.checkout.entity.CheckoutEntity;
import br.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {
    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
