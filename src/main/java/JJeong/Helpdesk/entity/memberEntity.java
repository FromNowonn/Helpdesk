package JJeong.Helpdesk.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "member")
public class memberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    @Column(length = 30,nullable = false)
    private String memberId;

    @Column(length = 30,nullable = false)
    private String memberPassword;

    @Column(length = 30,nullable = false)
    private String memberEmail;

    @Column(length = 30,nullable = false)
    private String memberPnumber;

    @Column(length = 6,nullable = false)
    private String memberSex;

    @Column(length = 50,nullable = false)
    private String memberAddress;

}
