public class Triangulo extends FiguraGeometrica{

    public double base;
    public double altura;

    public Triangulo(){
        this.base = 0;
        this.altura = 0;
    }
    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }


    public void leitura(){
        super.leitura();
        System.out.print("Digite a base: ");
        setBase(scanner.nextDouble());
        System.out.print("Digite a altura: ");
        setAltura(scanner.nextDouble());
    }
    public void imprimir(){
        super.imprimir();
        System.out.printf("A base é %.2f cm\n", getBase());
        System.out.printf("A altura é %.2f cm\n", getAltura());
    }
    public String paraString(){
        return super.paraString() + "/ base: " + getBase() + "/ altura: " + getAltura();
    }
    public double getArea(){
        return (getBase() * getAltura()) / 2;
    }
    public void imprimirArea(){
        System.out.printf("A área é %.2f cm²\n", getArea());
    }


}
