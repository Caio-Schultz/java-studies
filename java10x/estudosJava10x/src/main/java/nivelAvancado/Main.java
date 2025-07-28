package nivelAvancado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 14));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 19));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 28));
        ninjas.add(new Ninja("Temari", "Suna", 39));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 57));

        // .stream
        // Filter - filtragem dos ninjas por vila
       /* ninjas.stream()
            .filter(ninja -> ninja.getAldeia().equals("Suna"))
            .forEach(System.out::println);
*/
        // Sorted - Ordenação de ninjas por nome
      /*  ninjas.stream()
            .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
            .forEach(System.out::println); */


        // Map - mostrar e mapear um atributo
     /*   ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println); */

        // Max - Filtrar por ninja mais velho
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);

        System.out.println("Ninja filtrado pelo mais velho: " + ninjaMaisVelho);

    }
}
