package study.section1.discount;

import study.section1.member.Grade;
import study.section1.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{

    private  int discountFixAmount = 1000; // 1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        return 0;
    }
}
