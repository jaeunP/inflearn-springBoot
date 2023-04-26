package jpabook.jpashop.repository.order.custom;

import jpabook.jpashop.domain.Order;
import jpabook.jpashop.repository.OrderSearch;

import java.util.List;

public interface OrderRepositoryCustom {
    List<Order> findAll_dsl(OrderSearch orderSearch);

    List<Order> findAllWithItem();

    List<Order> findAllWitMemberDelivery(int offset, int limit);
}
