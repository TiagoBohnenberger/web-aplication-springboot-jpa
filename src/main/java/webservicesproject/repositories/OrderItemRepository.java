package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
