

package ex21;
import javax.swing.JOptionPane;

public class Ex21 {

    
    public static void main(String[] args) {
        double lata350ml,garrafa600ml,garrafa2L,litros,litrostotal;
        String s_lata350ml,s_garrafa600ml, s_garrafa2L;
        
        s_lata350ml = JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE LATAS ");
        lata350ml = Double.parseDouble(s_lata350ml);
         
      
        s_garrafa600ml = JOptionPane.showInputDialog(null,"DIGA A QUANTIDADE GARRAFAS DE 600ML ");
        garrafa600ml = Double.parseDouble(s_garrafa600ml);
        
        s_garrafa2L = JOptionPane.showInputDialog(null,"DIGA A QUANTIDADE GARRAFAS DE 2L ");
        garrafa2L = Double.parseDouble(s_garrafa2L);
        
        litros = lata350ml*0.001;
        litros = garrafa600ml *0.001;
        litrostotal = lata350ml + garrafa600ml + garrafa2L;
        
        JOptionPane.showMessageDialog(null," A QUANTIDADE DE LITROS QUE ELE COMPROU É " + litrostotal);
    }
    
}
