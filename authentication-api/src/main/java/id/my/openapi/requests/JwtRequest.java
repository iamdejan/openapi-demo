package id.my.openapi.requests;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JwtRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -926468583005150707L;

    @NotBlank
    @Size(max = 15)
    private String username;

    @NotBlank
    @Size(min = 8)
    private String password;
}
