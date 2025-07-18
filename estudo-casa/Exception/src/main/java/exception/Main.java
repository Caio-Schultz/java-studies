package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /* Exception = Um evento que interrompe o fluxo normal do programa
                       (dividir por zero, arquivo não encontrado, tipo de entrada incompatível)
                       é possível "cercar" qualquer código perigoso com um try{} block
                       try{}, catch{}, finally{}
         */


     /*   try{
            System.out.println(1/0);
        }
        catch(ArithmeticException e){   // se o programa achar um exceção aritmética, vai imprimir o texto abaixo
            System.out.println("Você não pode dividir por 0!");
        }
        */

        Scanner scanner = new Scanner(System.in);

        try () {
            System.out.print("Digite um número: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {  // especifica a exceção exata para imprimir uma mensagem de erro
            System.out.println("Isso não é um número!");
        } catch (ArithmeticException e) {
            System.out.println("Você não pode dividir por zero!");
        } catch (Exception e) {  // nesse caso, não está especificando nenhuma exceção. Isso serve para qualquer exceção
            // Rede de segurança
            // é boa prática usar isso apenas no final e para erros que não são previsto. De resto, é interessante especificar cada exceção e imprimir o erro específico para que o usuário entenda e tente corrigir
            System.out.println("Alguma coisa deu errado!");
        }
        finally{
            scanner.close();
        }
        // finally é usado para limpar o programa. No exemplo, ele está fechando o scanner para não ocorrer nada fora do esperado. O que está dentro do finally é sempre executado independente se ocorreu uma exceção ou não


    }
}
