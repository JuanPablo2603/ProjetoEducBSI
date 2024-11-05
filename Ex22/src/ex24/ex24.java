package ex22;

import javax.swing.JOptionPane;

public class ex22 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Quantos litros de refresco deseja preparar?");
        double totalLitros = Double.parseDouble(input);

        
        double proporcaoAgua = 8.0 / 10.0; 
        double proporcaoSuco = 2.0 / 10.0; 

        
        double litrosAgua = totalLitros * proporcaoAgua;
        double litrosSuco = totalLitros * proporcaoSuco;

        
        String mensagem = String.format("Para fazer %.2f litros de refresco, você precisa de:\n- %.2f litros de água\n- %.2f litros de suco de maracujá", 
                                        totalLitros, litrosAgua, litrosSuco);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
