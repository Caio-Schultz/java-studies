public abstract class FiguraGeometrica {// não será criado nenhum objeto usando essa classe, ela é apenas Pai das outras

    abstract double area();  // ABSTRACT


    void display(){  // CONCRETE
        System.out.println("Isso é uma figura geométrica");
    }
}
