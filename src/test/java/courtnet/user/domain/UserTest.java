package courtnet.user.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class UserTest {

    @DisplayName("생성된 사용자의 로그인 아이디가 null인 경우 예외 발생 여부")
    @Test
    void createWith_Null_LoginId() {
        assertThatThrownBy(() -> {
            new User(1L, null, "1q2w3e4r", null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("생성된 사용자의 로그인 아이디가 공란일 경우 예외 발생 여부")
    @Test
    void createWith_Blank_LoginId() {
        assertThatThrownBy(() ->{
            new User(1L, "", "1q2w3e4r", null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("생성된 사용자의 로그인 아이디에 공란이 포함될 경우 예외 발생 여부")
    @Test
    void createWith_Include_Blank_LoginId() {
        assertThatThrownBy(() ->{
            new User(1L, "ab cd", "1q2w3e4r", null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("생성된 사용자의 로그인 비밀번호가 null인 경우 예외 발생 여부")
    @Test
    void createWith_Null_Password() {
        assertThatThrownBy(() -> {
            new User(1L, "abcd", null, null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("생성된 사용자의 로그인 비밀번호가 공란일 경우 예외 발생 여부")
    @Test
    void createWith_Blank_Password() {
        assertThatThrownBy(() ->{
            new User(1L, "abcd", "", null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("생성된 사용자의 로그인 비밀번호에 공란이 포함될 경우 예외 발생 여부")
    @Test
    void createWith_Include_Blank_Password() {
        assertThatThrownBy(() ->{
            new User(1L, "abcd", "1q2w 3e4r", null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
