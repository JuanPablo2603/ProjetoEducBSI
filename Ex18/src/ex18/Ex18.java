/* Declaração de variáveis
declare salário, salárioextra, imposto, saláriobruto, salárioliquido, horastrabalhadas, extra: real
declare s_horastrabalhadas, s_extra: cadeia

// Entrada de dados
escreva("Digite as horas trabalhadas: ")
leia(s_horastrabalhadas)
horastrabalhadas <- converteReal(s_horastrabalhadas)

escreva("Digite as horas extras trabalhadas: ")
leia(s_extra)
extra <- converteReal(s_extra)

// Cálculos
salário <- horastrabalhadas * 10
salárioextra <- extra * 15
imposto <- 0.1

saláriobruto <- salário + salárioextra
salárioliquido <- saláriobruto * (1 - imposto)

teste de mesa

horas // horaextra // saláriobruto // líquido // 
 8         5            1240           1160        
 5         2            400            360
*/
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