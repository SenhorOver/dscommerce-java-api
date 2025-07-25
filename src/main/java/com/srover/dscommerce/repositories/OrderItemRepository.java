package com.srover.dscommerce.repositories;

import com.srover.dscommerce.entities.Order;
import com.srover.dscommerce.entities.OrderItem;
import com.srover.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
