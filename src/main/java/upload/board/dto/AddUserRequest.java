package upload.board.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AddUserRequest {
    private String email;
    private String password;
}
