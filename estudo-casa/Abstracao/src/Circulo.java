public class Circulo extends FiguraGeometrica{

    double raio;


    Circulo(double raio){
        this.raio = raio;
    }

    @Override
    double area(){
        return Math.PI * Math.pow(raio, 2);
    }
}
