public class Retangulo extends FiguraGeometrica{

    double comprimento;
    double largura;

    Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    double area() {
        return comprimento * largura;
    }
}
