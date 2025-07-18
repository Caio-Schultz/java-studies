package desafios.terceiroDesafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolhaDoUsuario;

        int numeroMaximo = 2;
        int quantidadeDeNinjas = 0;
        int quantidadeDeUchihas = 0;
        Ninja[] listaDeNinjas = new Ninja[numeroMaximo];
        Uchiha[] listaDeUchihas = new Uchiha[numeroMaximo];


        System.out.println("==== Ninjas ====");

        do {
            System.out.println("1 - Mostrar informações dos ninjas");
            System.out.println("2 - Adicionar ninja");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("4 - Sair");
            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaDoUsuario){
                case 1:
                    if(quantidadeDeNinjas != 0) {
                        System.out.println("Lista de ninjas e suas informações: ");
                        for (int i = 0; i < listaDeNinjas.length; i++) {
                            if(listaDeNinjas == null){
                                System.out.println("Espaço vazio para adição de um ninja normal!");
                            }
                            System.out.println(listaDeNinjas[i].mostrarInformacoes());
                        }
                    }
                    else {
                        System.out.println("Não há nenhum ninja normal cadastrado!");
                    }

                    if (quantidadeDeUchihas != 0) {
                        System.out.println("Lista de Uchihas e suas informações: ");
                        for (int i = 0; i < listaDeUchihas.length; i++) {
                            if(listaDeUchihas[i] == null){
                                System.out.println("Espaço vazio para adição de um Uchiha!");
                            }
                            else {
                                System.out.println(listaDeUchihas[i].mostrarInformacoes());
                            }
                        }
                    }
                    else {
                        System.out.println("Não há nenhum uchiha cadastrado!");
                    }
                    break;
                case 2:
                    System.out.println("Digite 1 se o ninja é um Uchiha");
                    System.out.println("Digite 2 se for qualquer outro ninja");
                    int escolhaUchiha = scanner.nextInt();
                    scanner.nextLine();
                    if(escolhaUchiha == 1) {
                        Uchiha uchiha = new Uchiha();
                        System.out.print("Digite o nome do ninja: ");
                        uchiha.nome = scanner.nextLine();
                        System.out.print("Digite a idade do ninja: ");
                        uchiha.idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Digite a missão do ninja: ");
                        uchiha.missao = scanner.nextLine();
                        System.out.print("Digite o nível de dificuldade da missão: ");
                        uchiha.nivelDeDificuldade = scanner.nextLine();
                        System.out.print("Digite o status da missão: ");
                        uchiha.statusDaMissao = scanner.nextLine();
                        System.out.print("Digite a habilidade especial: ");
                        uchiha.habilidadeEspecial = scanner.nextLine();
                        System.out.println("Uchiha adicionado com sucesso!");

                        if (quantidadeDeUchihas < 2) {
                            listaDeUchihas[quantidadeDeUchihas] = uchiha;
                            quantidadeDeUchihas++;
                        }
                        else {
                            System.out.println("Não há mais espaço para adicionar Uchihas!");
                        }
                    }
                    else{
                        Ninja ninja = new Ninja();
                            System.out.print("Digite o nome do ninja: ");
                            ninja.nome = scanner.nextLine();
                            System.out.print("Digite a idade do ninja: ");
                            ninja.idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Digite a missão do ninja: ");
                            ninja.missao = scanner.nextLine();
                            System.out.print("Digite o nível de dificuldade da missão: ");
                            ninja.nivelDeDificuldade = scanner.nextLine();
                            System.out.print("Digite o status da missão: ");
                            ninja.statusDaMissao = scanner.nextLine();
                            System.out.println("Ninja adicionado com sucesso!");

                            if(quantidadeDeNinjas < 2){
                                listaDeNinjas[quantidadeDeNinjas] = ninja;
                                quantidadeDeNinjas++;
                            }
                            else {
                                System.out.println("Não há mais espaço para adicionar Ninjas!");
                            }
                    }
                    break;
                case 3:

                    if(quantidadeDeUchihas != 0) {
                        System.out.print("Digite o nome exato do Uchiha que você deseja atualizar a habilidade especial: ");
                        String nomeUchiha = scanner.nextLine();
                        for (int i = 0; i < listaDeUchihas.length; i++) {
                            if (listaDeUchihas[i].nome.equals(nomeUchiha)) {
                                System.out.print("Digite a nova habilidade especial: ");
                                String novaHabilidade = scanner.nextLine();
                                listaDeUchihas[i].habilidadeEspecial = novaHabilidade;
                                break;
                            }
                            else {
                                System.out.println("Esse nome não consta na lista de Uchihas");
                            }
                        }
                    }

                    else {
                        System.out.println("Não há nenhum Uchiha adicionado!");
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrando...Aguarde");
                    break;
                default:
                    System.out.println("Você não digitou nenhuma opção válida. Tente novamente!");
                    break;
            }

        } while (escolhaDoUsuario != 4);



        scanner.close();
    }
}
