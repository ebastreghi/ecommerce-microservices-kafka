package br.ecommerce.checkout.service;

import br.ecommerce.checkout.entity.CheckoutEntity;
import br.ecommerce.checkout.repository.CheckoutRepository;
import br.ecommerce.checkout.resource.checkout.CheckoutRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
//create constructor for all final attributes
@RequiredArgsConstructor
public class CheckoutServiceImpl implements CheckoutService{

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        final CheckoutEntity checkoutEntity = CheckoutEntity.builder()
                .code(UUID.randomUUID().toString())
                .status(CheckoutEntity.Status.CREATED)
                .build();
        return Optional.of(checkoutRepository.save(checkoutEntity));
    }
}
