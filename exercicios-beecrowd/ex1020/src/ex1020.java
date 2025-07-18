import java.util.Scanner;

public class ex1020 {
    public static void main(String[] args){

        /*Leia um valor inteiro correspondente à idade
         de uma pessoa em dias e informe-a em anos, meses e dias
         Obs.: apenas para facilitar o cálculo,
         considere todo ano com 365 dias e todo mês com 30 dias.
         Nos casos de teste nunca haverá uma situação que permite
         12 meses e alguns dias, como 360, 363 ou 364.
         Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

         */

        Scanner scanner = new Scanner(System.in);
        int diasVividos;
        int meses;
        int dias;
        int anos;


        System.out.print("Digite a quantidade total de dias que você viveu: ");
        diasVividos = scanner.nextInt();

    while(diasVividos <= 0) {
            System.out.println("Dado inválido");
            System.out.print("Digite a quantidade total de dias que você viveu: ");
            diasVividos = scanner.nextInt();
        }
        if(diasVividos > 395){
            anos = diasVividos / 365;
            meses = (diasVividos % 365) / 30;
            dias = (diasVividos% 365) % 30;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        else if(diasVividos > 365 && diasVividos < 395){
            anos = diasVividos / 365;
            meses = 0;
            dias = diasVividos % 365;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        else if(diasVividos == 365){
            anos = 1;
            meses = 0;
            dias = 0;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        else if(diasVividos < 365 && diasVividos > 30){
            anos = 0;
            meses = diasVividos / 30;
            dias = diasVividos % 30;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        else if(diasVividos == 30){
            anos = 0;
            meses = 1;
            dias = 0;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }
        else if(diasVividos < 30 && diasVividos > 0){
            anos = 0;
            meses = 0;
            dias = diasVividos;
            System.out.println("------------");
            System.out.println("Você tem: ");
            System.out.println(anos + " ano(s)");
            System.out.println(meses + " mes(es)");
            System.out.println(dias + " dia(s)");
        }




        scanner.close();
    }
}
