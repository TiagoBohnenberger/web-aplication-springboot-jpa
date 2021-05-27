package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.Order;
import webservicesproject.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
