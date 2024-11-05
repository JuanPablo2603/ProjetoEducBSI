
package ex18;
import javax.swing.JOptionPane;

public class Ex18 {

    
    public static void main(String[] args) {
      double salário,salárioextra,imposto , saláriobruto, salárioliquido, horastrabalhadas, extra;
      
      String  s_horastrabalhadas, s_extra;
     
      s_horastrabalhadas = JOptionPane.showInputDialog(null, " horas ");
      horastrabalhadas = Double.parseDouble(s_horastrabalhadas);
      
      s_extra = JOptionPane.showInputDialog(null, " horasextras ");
      extra = Double.parseDouble(s_extra);
      
      salário = horastrabalhadas * 10;
      salárioextra = horastrabalhadas * 15;
      imposto = 0.1;
      
      saláriobruto = (horastrabalhadas * salário) + (extra * salárioextra);
      salárioliquido = saláriobruto * (1 - imposto) ;
      
      JOptionPane.showMessageDialog(null,"SALÁRIO BRUTO SERÁ " + saláriobruto + " SALÁRIO LIQUIDO SERÁ " + salárioliquido);
      
   
      
      
      
    }

    
}
