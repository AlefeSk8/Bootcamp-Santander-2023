package com.guia.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Projeto Guia-Cruzeta",
        description = "Projeto RESTful API do Bootcamp Santander 2023",
        version = "1.0.5",
        contact = @Contact(
            name = "Álefe Araujo",
            url = "https://www.linkedin.com/in/alefe-kouichi-araujo-mikawa/",
            email = "alefe_sk8@hotmail.com"
        )
    ),
    servers = @Server(
        url = "http://localhost:8080",
        description = "URL do servidor gerado"
    )
)
public class SwaggerConfig {
    @Bean
    GroupedOpenApi api() {
        System.out.println("SwaggerConfig foi inicializado.");
        return GroupedOpenApi.builder()
            .group("Guia")
            .packagesToScan("com.guia") // Pacote onde estão os controladores
            .build();
    }
}