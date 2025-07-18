package nivelBasico;

public class Array2D {
    public static void main(String[] args) {

        // Primeiro é o valor da linha e o segundo é o valor da coluna
        String[][] ninjasEaldeias = new String[3][3];

        ninjasEaldeias[0][0] = "Kanoha";
        ninjasEaldeias[0][1] = "Naruto Uzumaki";
        ninjasEaldeias[0][2] = "Sasuke Uchiha";
        ninjasEaldeias[1][0] = "Nevoa";
        ninjasEaldeias[1][1] = "Zabuza";
        ninjasEaldeias[1][2] = "Haku";
        ninjasEaldeias[2][0] = "Deserto";
        ninjasEaldeias[2][1] = "Gaara";
        ninjasEaldeias[2][2] = "Temari";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(ninjasEaldeias[i][j]);
            }
        }

    }
}
