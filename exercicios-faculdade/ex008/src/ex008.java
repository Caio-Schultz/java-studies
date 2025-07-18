import javax.swing.JOptionPane;
public class ex008 {
    public static void main(String[] args){
        int num1, num2, resultado;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
        resultado = num1 + num2;
        JOptionPane.showMessageDialog(null, "O resultado da soma desses dois número é: " + resultado);

    }

}
