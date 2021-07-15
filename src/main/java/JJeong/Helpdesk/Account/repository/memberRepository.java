package JJeong.Helpdesk.Account.repository;

import JJeong.Helpdesk.Account.entity.memberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface memberRepository extends JpaRepository<memberEntity,Long> {

}


