package study.section1;

import study.section1.discount.DiscountPolicy;
import study.section1.discount.FixDiscountPolicy;
import study.section1.discount.RateDiscountPolicy;
import study.section1.member.MemberRepository;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;
import study.section1.member.MemoryMemberRepository;
import study.section1.order.OrderService;
import study.section1.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }


}
