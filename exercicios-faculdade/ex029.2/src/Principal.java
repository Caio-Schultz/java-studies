import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Relogio relogio = new Relogio();

        System.out.print("Digite as horas: ");
        relogio.setHora(scanner.nextInt());

        System.out.print("Digite os minutos: ");
        relogio.setMinuto(scanner.nextInt());

        System.out.print("Digite os segundos: ");
        relogio.setSegundo(scanner.nextInt());

        relogio.incrementarSegundo();
        relogio.incrementarMinuto();
        relogio.incrementarHora();
        relogio.decrementarSegundo();
        relogio.decrementarMinuto();
        relogio.decrementarHora();

        System.out.println(relogio.getHorario());
    }
}
