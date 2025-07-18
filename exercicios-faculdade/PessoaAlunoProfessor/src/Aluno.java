public class Aluno extends Pessoa{

    String curso;
    int fase;

    Aluno(){
       this.curso = "";
       this.fase = 0;
    }
    Aluno(int idPessoa, String nome, int idade, String curso, int fase){
        super(idPessoa, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getFase(){
        return fase;
    }
    public void setFase(int fase){
        this.fase = fase;
    }

    @Override
    public void solicitarDados(){
        super.solicitarDados();
        System.out.print("Digite seu curso: ");
        this.curso = scanner.nextLine();
        scanner.nextLine(); // limpeza de buffer
        System.out.print("Digite sua fase: ");
        this.fase = scanner.nextInt();
    }

    boolean verificarFormando() {
        if (this.fase < 8) {
            return false;
        } else {
            return true;
        }
    }

        @Override
        void mostrarDados(){
            super.mostrarDados();
            System.out.println(this.curso);
            System.out.println(this.fase);
            System.out.println(verificarFormando());
        }

    }

