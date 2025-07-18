public class metodoprintf {
    public static void main(String[] args){

        // método printf em alternativa ao print/println
        /* para especificar a variável é preciso: %[caractere-específico-do-tipo]
        Por exemplo: %s (s é o caracter para uma variável do tipo String)

        String nome = "Caio";

        System.out.printf("%s é meu nome", nome);
        Saída: Caio é meu nome
        Não é preciso fazer concatenação. Basta representar a variável com %[caractere-específico-do-tipo] e
        citar ela depois separando por vírgula.

        caractere dos tipos
        - String = %s
        - char = %c
        - int = %d
        - double = %f
        - boolean = %b
         */

        String nome = "Bob esponja";
        char primeiraLetra = 'B';
        int idade = 19;
        double altura = 60.5;
        boolean estaEmpregado = true;

        System.out.printf("Oi %s\n", nome);
        System.out.printf("O nome do Bob esponja começa com %c\n", primeiraLetra);
        System.out.printf("A idade do Bob esponja tem %d anos de idade\n", idade);
        System.out.printf("O Bob esponja tem %f cm de altura\n", altura);
        System.out.printf("O Bob esponja está empregado: %b\n", estaEmpregado);
        System.out.printf("%s tem %d anos de idade", nome, idade);
    }
}
