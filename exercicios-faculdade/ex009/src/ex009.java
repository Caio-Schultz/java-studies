import javax.swing.JOptionPane;
public class ex009 {
    public static void main(String[] args){
        int peso;
        double altura, IMC;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        IMC = peso/(altura*altura);
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC);
    }
}
