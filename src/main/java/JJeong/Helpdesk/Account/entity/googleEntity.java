package JJeong.Helpdesk.Account.entity;

import JJeong.Helpdesk.Account.util.GoogleRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "google_member")
public class googleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long googleId;

    @Column(nullable = false)
    private String googleName;

    @Column(nullable = false)
    private String googleEmail;

    @Column(nullable = false)
    private String googlePicture;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private GoogleRole googleRole;

    @Builder
    public googleEntity(String googleName, String googleEmail, String googlePicture, GoogleRole googleRole) {
        this.googleName = googleName;
        this.googleEmail = googleEmail;
        this.googlePicture = googlePicture;
        this.googleRole = googleRole;
    }



    public googleEntity update(String googleName, String googlePicture){
        this.googleName = googleName;
        this.googlePicture = googlePicture;
        return this;

    }
    public String getRoleKey(){
        return this.googleRole.getKey();
    }
}
