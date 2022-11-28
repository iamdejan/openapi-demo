package id.my.openapi.configurations;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * How do I know where to put @SecurityScheme: <a href="https://gist.github.com/NrktSLL/4a99710f605a672ca37fe618f5845bca">Github Gist</a>
 */
@Configuration
@SecurityScheme(type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT", name = "bearer-key")
public class SwaggerConfiguration {
    @Bean
    @Lazy
    public OpenAPI openApiDemo() {
        return new OpenAPI()
            .info(new Info().title("OpenAPI Demo")
                .description("OpenAPI Demo app to prove that we can generate Java class first.")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
