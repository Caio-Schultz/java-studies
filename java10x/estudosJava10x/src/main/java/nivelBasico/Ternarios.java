package nivelBasico;

public class Ternarios {
    public static void main(String[] args) {

        /*
        Ternário: maneira de reduzir o código
        variável: (condição) ? valorSeVerdadeiro : valorSeFalso;
        Ternário servem para substituir uma estrutura com if e else
        simples
        o '?' seria o if e o ':' seria o else
         */

        int numeroDeMissoes = 9;

        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";

        System.out.println(nivel);

    }
}
