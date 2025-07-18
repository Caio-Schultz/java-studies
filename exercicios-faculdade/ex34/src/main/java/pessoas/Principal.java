package pessoas;

public class Principal {
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        professor.lerDados("Caio", 19, 2000.50, "mestre");
        System.out.println(professor.imprimirDados());
        System.out.println(professor.getNomeFormatado());
        aluno.lerDados("Caio", 19, "ADS");
        System.out.println(aluno.getNomeFormatado());

    }
}
