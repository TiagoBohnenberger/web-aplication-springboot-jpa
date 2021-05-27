package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
