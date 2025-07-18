public class VarArgs {
    public static void main(String[] args){

        /* varargs (variable arguments) = permite que uma função
        aceite um número variável de argumentos
        torna a função mais flexível, sem a necessidade de funções overloaded (função overloaded são aquelas que possuem o mesmo nome com diferentes parâmetros
        java vai "empacotar" os argumentos em um array
         ... (ellipsis)
         */

        System.out.println(adicao(1, 10, 3, 4, 8));
        System.out.println(media());

    }
    static int adicao(int...numeros){   // ... indica um eclipsis, java vai gerar como se fosse um array
        int soma = 0;

        for(int numero : numeros){
            soma = soma + numero;
        }

        return soma;
    }
    static double media(double...numerosParaMedia){
        double somaParaMedia = 0;



        for(double numero : numerosParaMedia){    // é possível usar essa técnica dentro do for para passar pelos elementos de um array
            somaParaMedia += numero;
        }

        if(numerosParaMedia.length == 0){
            return 0;
        }
        else{
            double media = somaParaMedia / numerosParaMedia.length;
            return media;
        }

    }
}
