import javax.swing.JOptionPane;
public class ex007 {
    public static void main(String[] args){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
    }
}
