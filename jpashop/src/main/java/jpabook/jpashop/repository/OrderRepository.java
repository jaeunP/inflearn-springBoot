package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;

import jpabook.jpashop.repository.order.custom.OrderRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;




public interface OrderRepository extends
        JpaRepository<Order, Long>, OrderRepositoryCustom {

//    @Query("SELECT distinct o from Order o" +
//            " join fetch o.member m" +
//            " join fetch o.delivery d" +
//            " join fetch o.orderItems oi" +
//            " join fetch oi.item i")
//    List<Order> findAllWithItem();

//    @Query("select o from Order o" +
//            " join fetch o.member m" +
//            " join fetch o.delivery d")
//    List<Order> findAllWitMemberDelivery(int offset, int limit);
}
