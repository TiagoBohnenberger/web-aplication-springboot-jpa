package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
