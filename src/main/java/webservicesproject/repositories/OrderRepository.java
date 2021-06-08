package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
