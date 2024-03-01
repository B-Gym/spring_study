package study.section1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.section1.member.Grade;
import study.section1.member.Member;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;
import study.section1.order.Order;
import study.section1.order.OrderService;
import study.section1.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig app = new AppConfig();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "kimgoat", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "비타민C", 45000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());

    }
}
