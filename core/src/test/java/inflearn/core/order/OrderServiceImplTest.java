package inflearn.core.order;

import inflearn.core.discount.FixDiscountPolicy;
import inflearn.core.member.Grade;
import inflearn.core.member.Member;
import inflearn.core.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "ㄹㄷㄹ", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}