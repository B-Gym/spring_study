package study.section1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.section1.discount.DiscountPolicy;
import study.section1.discount.FixDiscountPolicy;
import study.section1.discount.RateDiscountPolicy;
import study.section1.member.MemberRepository;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;
import study.section1.member.MemoryMemberRepository;
import study.section1.order.OrderService;
import study.section1.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    // @Bean memberService -> new MemoryMemberRepositioy()
    // @Bean orderService -> new MemoryMemberRepositioy()

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }


}
