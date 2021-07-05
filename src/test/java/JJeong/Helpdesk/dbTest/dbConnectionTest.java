package JJeong.Helpdesk.dbTest;

import JJeong.Helpdesk.dto.memberDto;
import JJeong.Helpdesk.entity.memberEntity;
import JJeong.Helpdesk.repository.memberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class dbConnectionTest {
    @Autowired
    private memberRepository MemberRepository;
    @Test
    public void insertTest(){
        memberEntity memberentity = memberEntity.builder()
                .memberId("asdf")
                .memberPassword("asdfsdf")
                .memberEmail("asdf")
                .memberSex("ma")
                .memberPnumber("qwer")
                .memberAddress("qwer").build();
        MemberRepository.save(memberentity);

    }

}
