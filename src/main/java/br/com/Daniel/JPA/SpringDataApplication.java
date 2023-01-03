package br.com.Daniel.JPA;

import br.com.Daniel.JPA.Service.CrudCargoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
import java.util.Scanner;




@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

	private final CrudCargoService cargoService;
	private boolean system = true;
			public SpringDataApplication(CrudCargoService cargoservice){

			this.cargoService = cargoservice;


			}

			public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

		@Override
		public void run(String...args) throws Exception{
					Scanner scanner = new Scanner(System.in);
					while (system){
						System.out.println("Qual acão voce quer executar");
						System.out.println("0 - sair");
						System.out.println("1 - Cargo");
						System.out.println("2 - atualizar");

						int action = scanner.nextInt();

						if (action == 1){
							cargoService.Inicial(scanner);
						}else {
							system = false;
						}

					}
		}




			}



