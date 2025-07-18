import javax.swing.JOptionPane;
public class ex015 {
    public static void main(String[] args){
        int idade;
        String nome;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:  "));
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        if((idade >= 15) && (idade <= 25)){
            JOptionPane.showMessageDialog(null, nome + ". ACEITA.");
        }else{
            JOptionPane.showMessageDialog(null, nome + ". NÃO ACEITA.");
        }
    }
}
