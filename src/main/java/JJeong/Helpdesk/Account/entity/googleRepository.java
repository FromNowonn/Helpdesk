package JJeong.Helpdesk.Account.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface googleRepository extends JpaRepository<googleEntity, Long> {

    Optional<googleEntity> findByGoogleEmail(String googleEmail);
}
