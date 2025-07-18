import java.util.Scanner;

public class Calculadoracomswitch {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operador;
        double resultado = 0;
        boolean operadorValido = true; // essa variável é para não mostrar o resultado 0 após ser colocado um operador inválido

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /, ^): ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();




        switch(operador){
            case '+' -> resultado = num1 + num2;

            case '-' -> resultado = num1 - num2;

            case '*' -> resultado = num1*num2;

            case '/' -> {
                if(num2 == 0){
                    System.out.println("Não pode dividir por 0!");  // é possível fazer essa estrutura dentro de um case colocando chaves
                    operadorValido = false;
                }
                else{
                    resultado = num1/num2;
                }
            }

            case '^' -> resultado = Math.pow(num1, num2);

            default -> {
                System.out.println("Esse operador não é válido!");
                operadorValido = false;
            }
        }

        if(operadorValido == true){
            System.out.println(resultado);
        }



        scanner.close();
    }
}
