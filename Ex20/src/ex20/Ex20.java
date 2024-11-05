
package ex20;

import javax.swing.JOptionPane;


public class Ex20 {

    
    public static void main(String[] args) {
      double blusas,novelos, novelosporblusas ;
      String s_blusas, s_novelos;
      
      s_blusas = JOptionPane.showInputDialog(null, " numero de blusas ");
      blusas = Double.parseDouble(s_blusas);
      
      s_novelos = JOptionPane.showInputDialog(null, " numero de novelos ");
      novelos = Double.parseDouble(s_novelos);
      
      novelosporblusas = novelos / blusas;
      
      JOptionPane.showMessageDialog(null,"O GASTO É " + novelosporblusas);
    }
    
}
