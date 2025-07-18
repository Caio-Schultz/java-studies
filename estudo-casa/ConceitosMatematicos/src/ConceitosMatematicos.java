public class ConceitosMatematicos {
    public static void main(String[] args){

        // System.out.println(Math.PI) isso printa o número pi (dessa forma, não é preciso declarar uma variável com o valor de pi


        double result, result2, result3, result4, result5, result6, result7;

        result = Math.pow(2, 4);  // esse método gera o resultado de um número na potência de outro. Nesse caso, 2^4 = 16

        result2 = Math.sqrt(9); // esse método gera a raiz quadrada do número entre parênteses

        result3 = Math.round(3.14); // esse método arredonda o número entre parênteses para o inteiro mais próximo

        result4 = Math.ceil(3.14); // esse método arredonda para cima. Nesse caso, arredonda para 4

        result5 = Math.floor(3.99); // esse método arredonda para baixo. Nesse caso, arredonda para 3

        result6 = Math.max(10, 20); // esse método printa o maior número entre os dois colocados no parênteses

        result7 = Math.min(10, 20); // esse método printa o menor número entre os dois colocados no parênteses

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
}
