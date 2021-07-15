package JJeong.Helpdesk.dbTest;
import JJeong.Helpdesk.Account.entity.memberEntity;
import JJeong.Helpdesk.Account.repository.memberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

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

    @Test
    public void readTest(){
        Long memberNo = 1L;
        Optional<memberEntity> res = MemberRepository.findById(memberNo);
        System.out.println("===============================");
        if(res.isPresent()){
            memberEntity member = res.get();
            System.out.println(member);
        }
        System.out.println("===============================");

    }

}
