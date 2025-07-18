public class Triangulo extends FiguraGeometrica{

    double base;
    double altura;

    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    double area() {
        return (base * altura) / 2;
    }
}
