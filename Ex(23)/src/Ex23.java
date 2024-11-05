import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        // Leitura dos dados necessários
        double suaAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros:"));
        double suaSombra = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sua sombra em metros:"));
        double sombraPredio = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio em metros:"));

        // Cálculo da altura do prédio usando proporção
        double alturaPredio = (suaAltura * sombraPredio) / suaSombra;

        // Exibição da altura do prédio
        JOptionPane.showMessageDialog(null, "A altura do prédio é aproximadamente: " + String.format("%.2f", alturaPredio) + " metros");
    }
}
