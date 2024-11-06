
/*
escreva("DIGA A QUANTIDADE DE GARRAFAS DE 600ML: ")
leia(s_garrafa600ml)
garrafa600ml <- converteReal(s_garrafa600ml)

escreva("DIGA A QUANTIDADE DE GARRAFAS DE 2L: ")
leia(s_garrafa2L)
garrafa2L <- converteReal(s_garrafa2L)

// Cálculo do total de litros
litrostotal <- (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2)

// Exibe o resultado
escreva("A QUANTIDADE DE LITROS QUE ELE COMPROU É ", litrostotal)

TESTE DE MESA

Latade350ml // garrafa600ml // garrafa 2L// TOTAL // ESCREVA
4                4                4          11.8    11.8
5                10              15          37.75    37.75
*/

package ex21;
import javax.swing.JOptionPane;

public class Ex21 {

    public static void main(String[] args) {
        double lata350ml, garrafa600ml, garrafa2L, litrostotal;
        String s_lata350ml, s_garrafa600ml, s_garrafa2L;
        
        s_lata350ml = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE LATAS DE 350ML");
        lata350ml = Double.parseDouble(s_lata350ml);
        
        s_garrafa600ml = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE GARRAFAS DE 600ML");
        garrafa600ml = Double.parseDouble(s_garrafa600ml);
        
        s_garrafa2L = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE GARRAFAS DE 2L");
        garrafa2L = Double.parseDouble(s_garrafa2L);
        
        // Calculando o total de litros
        litrostotal = (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2);
        
        JOptionPane.showMessageDialog(null, "A QUANTIDADE DE LITROS QUE ELE COMPROU É " + litrostotal);
    }
}
