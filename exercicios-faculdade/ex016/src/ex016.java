import javax.swing.JOptionPane;
public class ex016 {
    public static void main(String[] args){
        int controle;
        double num1, num2, resultado;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar?" + "\n 1-Adição \n 2-Subtração \n 3-Multiplicação \n 4-Divisão"));

        switch(controle){

            case 1:
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
            break;

            case 2:
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
            break;

            case 3:
                resultado = num1*num2;
                JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
            break;

            case 4:
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
            break;
        }



    }
}
