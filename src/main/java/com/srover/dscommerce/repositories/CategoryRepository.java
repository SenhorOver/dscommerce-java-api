package com.srover.dscommerce.repositories;

import com.srover.dscommerce.entities.Category;
import com.srover.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
