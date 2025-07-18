public class Principal {
    public static void main(String[] args){

        /*
            Abstração = Usado para definir classes e métodos abstratos
                        Abstração é o processo de esconder os detalhes de implementação
                        e mostra apenas as características essenciais
                        classes abstratas não podem ser instanciadas diretamente
                        pode conter métodos 'abstratos' (que deve ser implementado)
                        pode conter métodos 'concretos' (que são herdados)
         */


        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4, 5);
        Retangulo retangulo = new Retangulo(6, 7);

        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        System.out.println(retangulo.area());
    }
}
