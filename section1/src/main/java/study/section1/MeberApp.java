package study.section1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.section1.member.*;

public class MeberApp {
    public static void main(String[] args) {
//        AppConfig app = new AppConfig();
//         MemberService memberService = app.mamberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "kimgoat", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member: " + member.getName());
        System.out.println("findMember: " + findMember.getName());
    }
}
