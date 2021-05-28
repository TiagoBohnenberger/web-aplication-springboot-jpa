package webservicesproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
