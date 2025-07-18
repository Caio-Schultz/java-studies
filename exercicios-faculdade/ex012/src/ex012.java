import javax.swing.JOptionPane;
public class ex012 {
    public static void main(String[] args){
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        if(num1 > num2){
            JOptionPane.showMessageDialog(null, num1 + " é maior que " + num2);
        }else if(num1 == num2){
                JOptionPane.showMessageDialog(null, num1 + " é igual a " + num2);
            }else{
                JOptionPane.showMessageDialog(null, num2 + " é maior que " + num1);
            }

    }
}
