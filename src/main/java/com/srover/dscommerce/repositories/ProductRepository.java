package com.srover.dscommerce.repositories;

import com.srover.dscommerce.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Parece que JOIN FETCH funciona com Pageable agora
    @Query("SELECT obj " +
            "FROM Product obj " +
            "JOIN FETCH obj.categories " +
            "WHERE UPPER(obj.name) LIKE UPPER(CONCAT('%',:name,'%'))")
    Page<Product> searchByName(String name, Pageable pageable);

    // Forma onde o JOIN FETCH não funcionava com Pageable
//    @Query("SELECT obj FROM Product obj JOIN FETCH obj.categories WHERE obj IN :products ")
//    List<Product> searchProductsCategories(List<Product> products);
}
