package com.dio.projetoControleAcesso;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Controle de Ponto e Acesso",
				description = "API Rest para controle de ponto e acesso de usuários",
				version = "1.0.0",
				contact = @Contact(
						name = "Wiliam Eduardo",
						url = "https://github.com/wiltzl",
						email = "wiliam_eduardo@yahoo.com.br"),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0.html")))

public class ProjetoControleAcessoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoControleAcessoApplication.class, args);
	}
}