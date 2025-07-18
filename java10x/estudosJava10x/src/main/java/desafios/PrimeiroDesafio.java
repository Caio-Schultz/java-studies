package desafios;

public class PrimeiroDesafio {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        String nomeNinja2 = "Sasuke Uchiha";
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja1 = 16;
        int idadeNinja2 = 20;
        int idadeNinja3 = 12;

        String missao1 = "Salvar aldeia";
        String missao2 = "Derrotar o vilão";
        String missao3 = "Destruir aldeia";

        char nivelDificuldade1 = 'A';
        char nivelDificuldade2 = 'C';
        char nivelDificuldade3 = 'B';

        String statusConclusao1;
        String statusConclusao2;
        String statusConclusao3;

        if(idadeNinja1 < 15 && (nivelDificuldade1 == 'A' || nivelDificuldade1 == 'B')){
            statusConclusao1 = "não concluída!";
        }
        else {
            statusConclusao1 = "concluída";
        }

        if(idadeNinja2 < 15 && (nivelDificuldade1 == 'A' || nivelDificuldade1 == 'B')){
            statusConclusao2 = "não concluída!";
        }
        else {
            statusConclusao2 = "concluída";
        }

        if(idadeNinja3 < 15 && (nivelDificuldade1 == 'A' || nivelDificuldade1 == 'B')){
            statusConclusao3 = "não concluída!";
        }
        else {
            statusConclusao3 = "concluída";
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missão do ninja: " + missao1);
        System.out.println("Nível de dificuldade: " + nivelDificuldade1);
        System.out.println("Status da missão: " + statusConclusao1);
        System.out.println("-----------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missão do ninja: " + missao2);
        System.out.println("Nível de dificuldade: " + nivelDificuldade2);
        System.out.println("Status da missão: " + statusConclusao2);
        System.out.println("-----------------------------------------------");
        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missão do ninja: " + missao3);
        System.out.println("Nível de dificuldade: " + nivelDificuldade3);
        System.out.println("Status da missão: " + statusConclusao3);
        System.out.println("-----------------------------------------------");
    }
}
