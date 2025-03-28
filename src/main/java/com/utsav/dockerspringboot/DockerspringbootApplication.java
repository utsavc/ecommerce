package com.utsav.dockerspringboot;

import com.utsav.dockerspringboot.commandlinerunner.LoadDatabase;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

@OpenAPIDefinition(info = @Info(
        title="Ecommerce RestFul Services",
        description = "A simple ecommerce project"
),
        servers = @Server(
                url = "http://localhost:8080/",
                description = "hosted here"
        )
)
public class DockerspringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DockerspringbootApplication.class, args);
    }

}
