package JJeong.Helpdesk.repository;

import JJeong.Helpdesk.dto.memberDto;
import JJeong.Helpdesk.entity.memberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface memberRepository extends JpaRepository<memberEntity,Long> {
    @Override
    List<memberEntity> findAllById(Iterable<Long> longs);
}
