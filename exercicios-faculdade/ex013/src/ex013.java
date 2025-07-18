import javax.swing.JOptionPane;
public class ex013 {
    public static void main(String[] args){
        double salarioBruto, valorPrestacao, valorMaximo;
        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto:"));
        valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação"));
        valorMaximo = salarioBruto*0.3;
        if(valorPrestacao > valorMaximo){
            JOptionPane.showMessageDialog(null, "O empréstimo não pode ser concedido!");
        }else{
            JOptionPane.showMessageDialog(null, "O empréstimo pode ser concedido!");
        }
    }
}
