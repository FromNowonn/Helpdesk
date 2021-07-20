package JJeong.Helpdesk.config.auth.dto;

import JJeong.Helpdesk.Account.entity.googleEntity;
import lombok.Getter;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(googleEntity googleentity) {
        this.name = googleentity.getGoogleName();
        this.email = googleentity.getGoogleEmail();
        this.picture = googleentity.getPicture();
    }
}
