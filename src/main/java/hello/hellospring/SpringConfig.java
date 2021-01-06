package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Repository, @Service 안쓰고 하는 방법
@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    //구현 클래스를 변경해야만 하는 상황에는 bean에 등록을 많이 한다.
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
