package id.my.openapi.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serial;
import java.io.Serializable;

/**
 * How do I know the @Schema annotation: <a href="https://stackoverflow.com/a/61075383">here</a>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class JwtRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = -926468583005150707L;

    @NotBlank
    @Size(max = 15)
    @Schema(description = "Dummy username.", example = "openapi-demo")
    private String username;

    @NotBlank
    @Size(min = 8)
    @Schema(description = "Dummy password.", example = "lorem-ipsum")
    private String password;
}
