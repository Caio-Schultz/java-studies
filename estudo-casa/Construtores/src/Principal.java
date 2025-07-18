public class Principal {
    public static void main(String[] args){

        /* construtores = método especial para inicializar objetos
                          você pode passar argumentos para os construtores
                          e configurar valores iniciais
         */

        Estudante estudante1 = new Estudante("Caio", 19, 7.5);
        Estudante estudante2 = new Estudante("João", 18, 5.5);
        Estudante estudante3 = new Estudante("Maria", 20, 10);
        Estudante estudante4 = new Estudante("Carlos", 30, 8.7);

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.nota);
        System.out.println(estudante1.estaMatriculado);
        estudante1.Estudar();
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nota);
        System.out.println(estudante2.estaMatriculado);
        estudante2.Estudar();
        System.out.println(estudante3.nome);
        System.out.println(estudante3.idade);
        System.out.println(estudante3.nota);
        System.out.println(estudante3.estaMatriculado);
        estudante3.Estudar();
        System.out.println(estudante4.nome);
        System.out.println(estudante4.idade);
        System.out.println(estudante4.nota);
        System.out.println(estudante4.estaMatriculado);
        estudante4.Estudar();
    }
}
