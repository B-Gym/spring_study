package study.section1.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import study.section1.member.Grade;
import study.section1.member.Member;
import study.section1.member.MemberService;
import study.section1.member.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "kimgoat", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "비타민C", 45000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
