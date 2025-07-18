import java.util.Scanner;

public class ex1040 {
    public static void main(String[] args){
        /*Leia quatro números (N1, N2, N3, N4),
        cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
        Calcule a média com pesos 2, 3, 4 e 1, respectivamente,
        para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ".
        Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
        Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado."
        Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir
        a mensagem "Aluno em exame.". No caso do aluno estar em exame,
        leia um valor correspondente à nota do exame obtida pelo aluno.
        Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
        Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
        e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.",
        (caso a média tenha ficado 4.9 ou menos). Para estes dois casos
        (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem
        "Media final: " seguido da média final para esse aluno.
         */

        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[4];
        double somaComPeso;
        double media;
        double notaExame;

        System.out.print("Digite sua primeira nota (N1): ");
        notas[0] = scanner.nextDouble();
        System.out.print("Digite sua segunda nota (N2): ");
        notas[1] = scanner.nextDouble();
        System.out.print("Digite sua terceira nota (N3): ");
        notas[2] = scanner.nextDouble();
        System.out.print("Digite sua quarta nota (N4): ");
        notas[3] = scanner.nextDouble();

        somaComPeso = (notas[0]*2) + (notas[1]*3) + (notas[2]*4) + notas[3];

        media = somaComPeso/10;

        System.out.printf("Média: %.1f\n", media);

        if(media >= 7){
            System.out.println("Aluno Aprovado!");
        }
        else if(media < 5){
            System.out.println("Aluno Reprovado!");
        }
        else{
                System.out.println("Aluno em exame.");
                System.out.print("Digite a nota do exame: ");
                notaExame = scanner.nextDouble();
                media = (media + notaExame)/2;
                if(media >= 5){
                    System.out.println("Aluno Aprovado!");
                }
                else{
                    System.out.println("Aluno Reprovado!\n");
                }
            System.out.printf("Média Final: %.1f", media);
        }




        scanner.close();
    }
}
