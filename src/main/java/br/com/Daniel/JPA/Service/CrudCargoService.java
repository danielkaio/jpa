package br.com.Daniel.JPA.Service;

import br.com.Daniel.JPA.Repository.CargoReposytory;
import br.com.Daniel.JPA.orm.Cargo;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Scanner;

@Service
public class CrudCargoService {

    private boolean system = true;

    private  final CargoReposytory cargoReposytory;

        public  CrudCargoService(CargoReposytory cargoReposytory){
            this.cargoReposytory = cargoReposytory;

        }

        public  void Inicial(Scanner scanner) {

            while (system){

                System.out.println("qual ação de cargo");
                System.out.println("0 -sair");
                System.out.println("1 criar");
                System.out.println("2 atuaizar");

                int action = scanner.nextInt();

                switch (action){
                    case 1:
                        salvar(scanner);
                        break;
                    case 2:
                        atualizar(scanner);
                    default:
                        system = false;
                        break;
                }
            }

        }



        public void   salvar(Scanner scanner){

            System.out.println("descrição do cargo");
            String descriçao = scanner.next();
            Cargo cargo = new Cargo();
            cargo.setDescriçao(descriçao);
            cargoReposytory.save(cargo);
            System.out.println("salvo");


        }

        private  void atualizar(Scanner scanner){

            System.out.println("id");
            int id = scanner.nextInt();
            System.out.println("descrição");
            String descricao = scanner.next();
            Cargo cargo = new Cargo();
            cargo.setId(id);
            cargo.setDescriçao(descricao);
            cargoReposytory.save(cargo);
            System.out.println("atulizado");



            }
        }


