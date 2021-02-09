package br.ecommerce.checkout.config;

import br.ecommerce.checkout.streaming.CheckoutCreatedSource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class
})
public class StreamingConfig {
}
