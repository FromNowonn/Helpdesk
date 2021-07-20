package JJeong.Helpdesk.Account.dto;

import JJeong.Helpdesk.Account.entity.googleEntity;
import JJeong.Helpdesk.Account.util.googleRole;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;
@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String googleName;
    private String googleEmail;
    private String googlePicture;
    @Builder
    public OAuthAttributes(Map<String, Object> attributes, String nameAttributeKey, String googleName, String googleEmail, String googlePicture) {
        this.attributes = attributes;
        this.nameAttributeKey = nameAttributeKey;
        this.googleName = googleName;
        this.googleEmail = googleEmail;
        this.googlePicture = googlePicture;
    }
    public static  OAuthAttributes of(String registarationId, String userNameAttributeName, Map<String,Object> attributes){
        return ofGoogle(userNameAttributeName, attributes);
    }
    private static OAuthAttributes ofGoogle(String userNameAttributeName,Map<String,Object> attributes){
        return OAuthAttributes.builder()
                .googleName((String) attributes.get("googleName"))
                .googleEmail((String) attributes.get("googleEmail"))
                .googlePicture((String) attributes.get("googlePicture"))
                .attributes(attributes)
                .nameAttributeKey(userNameAttributeName).build();
    }
    public googleEntity toEntity(){
        return googleEntity.builder()
                .googleName(googleName)
                .googleEmail(googleEmail)
                .googleRole(googleRole.GUEST).build();
    }
}
