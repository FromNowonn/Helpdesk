package JJeong.Helpdesk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class memberDto {
    private Long memberNo;
    private String memberId;
    private String memberPassword;
    private String memberEmail;
    private String memberPnumber;
    private String memberSex;
    private String memberAddress;

}
