package inflearn.core;

import inflearn.core.discount.DiscountPolicy;
import inflearn.core.discount.FixDiscountPolicy;
import inflearn.core.discount.RateDiscountPolicy;
import inflearn.core.member.MemberRepository;
import inflearn.core.member.MemberService;
import inflearn.core.member.MemberServiceImpl;
import inflearn.core.member.MemoryMemberRepository;
import inflearn.core.order.OrderService;
import inflearn.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
