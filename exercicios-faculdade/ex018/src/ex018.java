import javax.swing.JOptionPane;
public class ex018 {
    public static void main(String[] args){
        String nome;
        String controle;
        double preco, desconto;
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        controle = JOptionPane.showInputDialog("Qual a categoria desse produto?" + "\n a - Roupa b - Calçados \n c - Comida d - Acessórios e - Eletrônicos");
        char controleCHAR = controle.charAt(0);
        switch(controleCHAR){

            case 'a':
                desconto = preco*0.9;
                JOptionPane.showMessageDialog(null, "O preço desse produto com o desconto \n da categoria de roupas é R$" + desconto);
            break;

            case 'b':
                desconto = preco*0.85;
                JOptionPane.showMessageDialog(null, "O preço desse produto com o desconto \n da categoria de calçados é R$" + desconto);
            break;

            case 'c':
                desconto = preco*0.8;
                JOptionPane.showMessageDialog(null, "O preço desse produto com o desconto \n da categoria de comidas é R$" + desconto);
            break;

            case 'd':
                desconto = preco*0.75;
                JOptionPane.showMessageDialog(null, "O preço desse produto com o desconto \n da categoria de acessórios é R$" + desconto);
            break;

            case 'e':
                desconto = preco*0.5;
                JOptionPane.showMessageDialog(null, "O preço desse produto com o desconto \n da categoria de eletrônicos é R$" + desconto);
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            break;
        }
    }
}
