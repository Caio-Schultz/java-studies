import javax.swing.JOptionPane;
public class ex017 {
    public static void main(String[] args){
        String controle;
        controle = JOptionPane.showInputDialog("Qual a profissão de Tibúrcio?" + "\n a - Advogado \n d - Designer \n e - Engenheiro \n m - Médico \n p - Programador");
        char controleCHAR = controle.charAt(0);
        switch(controleCHAR){

            case 'a':
                JOptionPane.showMessageDialog(null, "Tibúrcio é advogado.");
            break;

            case 'd':
                JOptionPane.showMessageDialog(null, "Tibúrcio é designer.");
            break;

            case 'e':
                JOptionPane.showMessageDialog(null, "Tibúrcio é engenheiro.");
            break;

            case 'm':
                JOptionPane.showMessageDialog(null, "Tibúrcio é médico.");
            break;

            case 'p':
                JOptionPane.showMessageDialog(null, "Tibúrcio é programador.");
            break;

            default:
                JOptionPane.showMessageDialog(null, "Tibúrcio é desempregado.");
            break;
        }
    }
}
