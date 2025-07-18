import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args){

        /*
        ArrayList<Professor> listaDeProfessores = new ArrayList<>();

        Professor professor1 = new Professor(1, "José", 45, 10000, "Mestre");

        Professor professor2 = new Professor(2, "Pedro", 39, 8000, "Doutor");


        Professor professor3 = new Professor(3, "Junior", 24, 5000, "Especialista");

        listaDeProfessores.add(professor1);
        listaDeProfessores.add(professor2);
        listaDeProfessores.add(professor3);

        for (Professor professor : listaDeProfessores){
            professor.mostrarDados();
        }
        */

        Stack<Aluno> pilhaDeAlunos = new Stack<>();

        for(Aluno aluno : pilhaDeAlunos){
            aluno.solicitarDados();
            aluno.mostrarDados();
        }


    }
}
