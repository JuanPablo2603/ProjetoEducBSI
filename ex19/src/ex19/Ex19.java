

package ex19;

import javax.swing.JOptionPane;


public class Ex19 {

    
    public static void main(String[] args) {
      double anelchip = 4, anelalimentos = 3.50, gasto, frangos;
      
      String s_frangos;
      s_frangos = JOptionPane.showInputDialog(null, " quantidade de frangos ");
      frangos = Double.parseDouble(s_frangos);
      
      gasto = frangos + anelchip + anelalimentos;
      
      JOptionPane.showMessageDialog(null,"O GASTO FOI " + gasto);
      
   
    }
    
}
