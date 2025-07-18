import javax.swing.JOptionPane;
public class ex010 {
    public static void main(String[] args){
        int num1, num2, resultado;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        resultado = num1 + num2;
        if(resultado > 10){
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
        }
    }
}
