

import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args) {
        // Leitura dos valores das 4 compras
        double compra1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª compra:"));
        double compra2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª compra:"));
        double compra3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 3ª compra:"));
        double compra4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 4ª compra:"));

        // Cálculo dos pontos acumulados
        double totalGasto = compra1 + compra2 + compra3 + compra4;
        double pontos = totalGasto / 5.0;

        // Exibição do total de pontos
        JOptionPane.showMessageDialog(null, "Pontos acumulados: " + pontos);
    }
}

