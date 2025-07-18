package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        int numeroAlimentos;

        System.out.print("Digite o número de alimentos que você deseja armazenar: ");
        numeroAlimentos = scanner.nextInt();

        scanner.nextLine(); // limpeza de buffer

        Collections.sort(foods);

        for(int i = 1; i <= numeroAlimentos; i++){
            System.out.print("Digite o alimento número " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        for(int i = 0; i < numeroAlimentos; i++){
            System.out.println(foods.get(i));
        }




        scanner.close();
    }
}
