public class Veiculo {  // classe começa com letra maiúscula

    private double kilometrosRodados;
    private double litros;


    public Veiculo(){
        this.kilometrosRodados = 0;
        this.litros = 0;
    }
    public Veiculo(double kilometrosRodados, double litros){
        this.kilometrosRodados = kilometrosRodados;
        this.litros = litros;
    }
    public double getKilometrosRodados(){
        return kilometrosRodados;
    }
    public void setKilometrosRodados(double kilometrosRodados){
        this.kilometrosRodados = kilometrosRodados;
    }
    public double getLitros(){
        return litros;
    }
    public void setLitros(double litros){
        this.litros = litros;
    }
    public double getConsumo(){
        return (getKilometrosRodados() / getLitros());
    }
}

