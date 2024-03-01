package study.section1;

import study.section1.member.*;

public class MeberApp {
    public static void main(String[] args) {
        AppConfig app = new AppConfig();
        Member member = new Member(1L, "kimgoat", Grade.VIP);
        app.memberService().join(member);

        Member findMember = app.memberService().findMember(1L);
        System.out.println("new member: " + member.getName());
        System.out.println("findMember: " + findMember.getName());
    }
}
