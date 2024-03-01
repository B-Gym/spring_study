package study.section1.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import study.section1.member.Grade;
import study.section1.member.Member;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되야 한다.")
    void vip_o(){
        // given
        Member member = new Member(1L, "kimgoat", Grade.VIP);
        // when
        int discount = discountPolicy.discount(member, 40000);
        // then
        Assertions.assertThat(discount).isEqualTo(4000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아여 한다.")
    void vip_x(){
        // given
        Member member = new Member(1L, "kimgoat", Grade.BASIC);
        // when
        int discount = discountPolicy.discount(member, 40000);
        // then
        Assertions.assertThat(discount).isEqualTo(0);
    }

}