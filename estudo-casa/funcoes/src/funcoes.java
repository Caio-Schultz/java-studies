public class funcoes {
    public static void main(String[] args){

        // funções = um bloco de código reutilizável que é executado quando chamado ()

        String nome = "Caio";
        int idade = 19;

        happyBirthday(nome, idade);
        /*
        nome e idade são ARGUMENTOS nesse caso, eles estão declarados em uma função
        e para serem "transferidos" para outra função são escritos entre os parênteses
         */

        System.out.println(aoQuadrado(3));

        System.out.println(aoCubo(3));

        String nome2 = "Caio";
        String sobrenome = "Schultz";

        System.out.println(nomeCompleto(nome2, sobrenome));

        int idade2 = 17;

        if(checagemDeIdade(idade2)){
            System.out.println("Você pode dirigir!");
        }
        else {
            System.out.println("É preciso ter 18+ para dirigir!");
        }

    }
    static void happyBirthday(String nome, int idade){         // para essa função receber os argumentos, ela precisa declarar parâmetros que estejam alinhados com os argumentos, ou seja, se a variável nome é String precisa ser declarada como tal. Além disso é preciso declarar na ordem em que elas serão recebidas
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", nome);
        System.out.printf("You are %d years old!\n", idade);
        System.out.println("Happy birthday to you!\n");
    } // a palavra void identifica que essa função não vai retornar nenhum valor
    static double aoQuadrado(double numero){   // nesse caso, estamos retornando um valor, para isso usa-se o comando return
        return numero * numero;
    } // como está retornando um valor double, precisamos colocar double ao invés de void na função
    static double aoCubo(double numero){
        return numero * numero * numero;
    }
    static String nomeCompleto(String nome2, String sobrenome){
        return nome2 + " " +  sobrenome;
    }
    static boolean checagemDeIdade(int idade2){
        if(idade2 >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
