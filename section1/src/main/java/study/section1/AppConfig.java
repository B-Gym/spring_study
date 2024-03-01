package study.section1;

import study.section1.discount.FixDiscountPolicy;
import study.section1.discount.RateDiscountPolicy;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;
import study.section1.member.MemoryMemberRepository;
import study.section1.order.OrderService;
import study.section1.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }


}
