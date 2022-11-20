package id.my.openapi.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {
    @NotBlank
    @Size(max = 20)
    private String id;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    @Size(max = 20)
    private String name;
}
