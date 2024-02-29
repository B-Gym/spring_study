package study.section1.order;

import study.section1.discount.DiscountPolicy;
import study.section1.discount.FixDiscountPolicy;
import study.section1.member.Member;
import study.section1.member.MemberRepository;
import study.section1.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private  final MemberRepository memberRepository = new MemoryMemberRepository();
    private  final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
