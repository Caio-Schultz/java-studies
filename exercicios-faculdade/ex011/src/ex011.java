import javax.swing.JOptionPane;
public class ex011 {
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if((numero % 2) == 0){
            JOptionPane.showMessageDialog(null, numero + " é múltiplo de 2!");
        }else{
            JOptionPane.showMessageDialog(null, numero + " não é múltiplo de 2!");
        }
    }
}
