package projeto.neto.projeto_api_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server URL")})
@SpringBootApplication
public class ProjetoApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiRestApplication.class, args);
	}

}
