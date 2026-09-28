package com.rollerspeed.rollerspeed.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI rollerSpeedOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("API REST - Roller Speed")
                        .description(
                                "API REST para la gestión de recursos de la escuela de patinaje Roller Speed."
                        )
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Grupo 2")
                                .email("grupo2@rollerspeed.local"))
                        .license(new License()
                                .name("Uso académico")));
    }
}