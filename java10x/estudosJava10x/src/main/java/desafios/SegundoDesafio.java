package desafios;

import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolhaDoUsuario;
        int ninjasCadastrados = 0;
        int NUMERO_MAX = 5;
        String[] ninja = new String[NUMERO_MAX];

        System.out.println("------- Menu Ninjas -------");
        System.out.println("--Escolha uma opção abaixo--");

        do{
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar todos os ninjas");
            System.out.println("3 - Sair");
            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaDoUsuario) {
                case 1:
                    if(ninjasCadastrados < 5){
                        System.out.print("Escreva o nome do ninja: ");
                        ninja[ninjasCadastrados] = scanner.nextLine();
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }
                    else{
                        System.out.println("Não há mais espaço para adicionar ninjas");
                    }
                    break;
                case 2:
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado!");
                    }
                    else {
                        System.out.println("Lista de todos os ninjas:");
                        for (int i = 0; i < ninja.length; i++) {
                            if(ninja[i] != null) {
                                System.out.println(ninja[i]);
                            }
                            else {
                                System.out.println("Ninja ainda não cadastrado");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo da aplicação...Aguarde");
                    break;
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        }while(escolhaDoUsuario != 3);

    }
}
