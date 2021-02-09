package br.ecommerce.checkout.repository;

import br.ecommerce.checkout.entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CheckoutRepository extends JpaRepository<CheckoutEntity, Long> {
    List<CheckoutEntity> findTop10ByCodeOrderById(String code);

}
