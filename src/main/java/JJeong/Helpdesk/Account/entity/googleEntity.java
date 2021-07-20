package JJeong.Helpdesk.Account.entity;

import JJeong.Helpdesk.Account.util.googleRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class googleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long googleId;

    @Column(nullable = false)
    private String googleName;

    @Column(nullable = false)
    private String googleEmail;

    @Column(nullable = false)
    private String picture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private googleRole googleRole;

    @Builder
    public googleEntity(String googleName, String googleEmail, String picture, googleRole googleRole) {
        this.googleName = googleName;
        this.googleEmail = googleEmail;
        this.picture = picture;
        this.googleRole = googleRole;
    }



    public googleEntity update(String name, String picture){
        this.googleName = googleName;
        this.picture = picture;
        return this;

    }
    public String getRoleKey(){
        return this.googleRole.getKey();
    }
}
