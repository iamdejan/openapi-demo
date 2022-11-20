package id.my.openapi.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@AllArgsConstructor
public class JwtResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -8091879091924046844L;

    private final String token;
}
