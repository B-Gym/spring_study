package study.section1;

import study.section1.member.Grade;
import study.section1.member.Member;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;
import study.section1.order.Order;
import study.section1.order.OrderService;
import study.section1.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "kimgoat", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "비타민C", 45000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());

    }
}
