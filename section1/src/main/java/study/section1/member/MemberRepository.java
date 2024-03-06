package study.section1.member;

import org.springframework.stereotype.Component;

@Component
public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
