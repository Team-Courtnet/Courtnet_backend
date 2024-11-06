package courtnet.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import gender;
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;

    private String password;

    private String username;

    private Integer icon;

    private String address;

    private Integer height;

    // enum 으로 male, female 만들어주기?
    private enum gender;

    public User(final Long id, final String loginId, final String password, final String username) throws Exception {

        this.id = id;
        this.loginId = loginId;
        this.password = password;

        if (loginId == null) {
            throw new IllegalArgumentException("아이디가 null일 수 없습니다.");
        }
        else if (loginId.isBlank()) {
            throw new IllegalArgumentException("아이디가 빈칸이거나 공백일 수 없습니다.");
        }
        else if (loginId.contains(" ")) {
            throw new IllegalArgumentException("아이디의 중간에 공백이 들어갈 수 없습니다.");
        }

        if (password == null) {
            throw new IllegalArgumentException("비밀번호가 null일 수 없습니다.");
        }
        else if (password.isBlank()) {
            throw new IllegalArgumentException("비밀번호가 빈칸이거나 공백일 수 없습니다.");
        }
        else if (password.contains(" ")) {
            throw new IllegalArgumentException("비밀번호의 중간에 공백이 들어갈 수 없습니다.");
        }




    }
}
