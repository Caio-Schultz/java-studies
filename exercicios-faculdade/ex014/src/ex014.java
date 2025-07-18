import javax.swing.JOptionPane;
public class ex014 {
    public static void main(String[] args){
        int anoNascimento, anoAtual, idade;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu:"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você está:"));
        idade = anoAtual - anoNascimento;
        if(anoNascimento < anoAtual){
            JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade!");
        }else{
            JOptionPane.showMessageDialog(null, "Dados inválidos");
        }
    }
}
