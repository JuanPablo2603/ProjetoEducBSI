import javax.swing.JOptionPane;

public class Ex22 {
    public static void main(String[] args) {
        // Leitura da quantidade de cada tipo de moeda
        int qtd1cent = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 1 centavo:"));
        int qtd5cent = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 5 centavos:"));
        int qtd10cent = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 10 centavos:"));
        int qtd25cent = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 25 centavos:"));
        int qtd50cent = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 50 centavos:"));
        int qtd1real = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de moedas de 1 real:"));

        // Cálculo do total em reais
        double total = (qtd1cent * 0.01) + (qtd5cent * 0.05) + (qtd10cent * 0.10) + 
                       (qtd25cent * 0.25) + (qtd50cent * 0.50) + (qtd1real * 1.00);

        // Exibição do total economizado
        JOptionPane.showMessageDialog(null, "Total economizado: R$ " + String.format("%.2f", total));
    }
}
