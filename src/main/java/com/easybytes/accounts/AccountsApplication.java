package com.easybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/* If some packages are outside main application -
@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")
*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Account microservices REST API Documentation",
                description = "EasyBank Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Ashfaq M",
                        email = "ashfaq@gmail.com",
                        url = "https://www.ashfaq.com"
                ),
                license = @License(
                        name = "Apache 2.O",
                        url = "https://www.apache.com"
                )
),
        externalDocs = @ExternalDocumentation(
                description = "EasyBank Accounts microservice REST API Documentation",
                url = "https://www.ashfaq.com"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
