package id.my.openapi.configurations;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class SwaggerConfiguration {
    @Bean @Lazy
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
            .info(new Info().title("OpenAPI Demo")
                .description("OpenAPI Demo app to prove that we can generate Java class first.")
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}
