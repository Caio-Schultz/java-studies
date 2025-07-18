package desafios.sextoDesafio;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

        Ninja ninja1 = new Ninja("Naruto", 16, "Aldeia da folha");
        Ninja ninja2 = new Ninja("Sasuke", 18, "Aldeia da folha");
        Ninja ninja3 = new Ninja("Sakura", 18, "Aldeia da folha");
        Ninja ninja4 = new Ninja("Gaara", 25, "Aldeia da Areia");
        Ninja ninja5 = new Ninja("Killer Bee", 21, "Aldeia da Nuvem");
        Ninja ninja6 = new Ninja("Zabuza", 30, "Aldeia da Névoa");
        Ninja ninja7 = new Ninja("Orochimaru", 22, "Aldeia da folha");

        listaDeNinjas.add(ninja1);
        listaDeNinjas.add(ninja2);
        listaDeNinjas.add(ninja3);
        listaDeNinjas.add(ninja4);
        listaDeNinjas.add(ninja5);
        listaDeNinjas.add(ninja6);
        listaDeNinjas.add(ninja7);

        for(Ninja ninja : listaDeNinjas){
            System.out.println(ninja);
        }

        listaDeNinjas.addFirst(ninja7);
        System.out.println(listaDeNinjas);

        listaDeNinjas.removeFirst();
        System.out.println(listaDeNinjas);


    }
}
