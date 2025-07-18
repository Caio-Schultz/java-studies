public class Ternaryoperator {
    public static void main(String[] args){

        // ternary operator ? = retorna 1 de 2 valores se a condição for verdadeira
        // variável = (condição) ? ifTrue : ifFalse;
        // pode substituir o if/else


        // exemplo de if/else
        /*
        int pontuação = 55;

        if(pontuação >= 60){
            System.out.println("Passou!");
        }
        else{
            System.out.println("Falhou!");
        }
         */

        int pontuacao = 60;

        String passouOuFalhou = (pontuacao >= 60) ? "Passou!" : "Falhou!";
        System.out.println(passouOuFalhou);

        int num1 = 4;

        String parOuImpar = ((num1 % 2) == 0) ? "É par!" : "É ímpar!";
        System.out.println(parOuImpar);

        int horario = 13;

        String AmOuPm = (horario >= 12) ? "A.M." : "P.M.";
        System.out.println(AmOuPm);

        int salario = 2000;

        double taxaDeImpostos = (salario <= 1900) ? 0 : 0.15;
        System.out.printf("Taxa de imposto: %.2f%%", taxaDeImpostos);

    }
}
