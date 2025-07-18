public class Circulo extends FiguraGeometrica{

    public double raio;

    public Circulo(){
        this.raio = 0;
    }
    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }
    public double getRaio(){
        return  raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public void leitura(){
        super.leitura();
        System.out.print("Digite o raio: ");
        setRaio(scanner.nextDouble());
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("O raio é " + getRaio() + " cm");
    }
    public String paraString(){
        return super.paraString() + "/ raio: " + getRaio();
    }
    public double getArea(){
        return (Math.PI * Math.pow(getRaio(), 2));
    }
    public void imprimirArea(){
        System.out.printf("A área é %.2f cm²\n", getArea());
    }



}
