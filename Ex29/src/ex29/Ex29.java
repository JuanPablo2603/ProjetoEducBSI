/*
 INÍCIO
    LER a,b,valorX;
escreva 
retaA = "Digite o valor de A ";
   retaB = "Digite o valor de B "; 
valorX = -b/a; 
    SE a>0 entao:
       ESCREVER "A reta toca o eixo X no ponto: (" + x + ", 0)"
    SENÃO
       ESCREVER "INVÁLIDO"
        
FIM

teste de mesa

A   //   B  //  VALORX  // ESCREVA 
10      20       -2,0      -2,0 
-50     0        -           -
 */
package ex29;

import javax.swing.JOptionPane;
public class Ex29 {

    
    public static void main(String[] args) {
        // var
        int retaA,retaB,valorX;
        String s_retaA,s_retaB;
        
        s_retaA = JOptionPane.showInputDialog("Digite o valor de A");
        retaA = Integer.parseInt(s_retaA);
        
       s_retaB=  JOptionPane.showInputDialog("Digite o valor de B");
       retaB =  Integer.parseInt(s_retaB);
       
       valorX= -retaB/retaA;
       
       if(retaA>0)
       {
           JOptionPane.showMessageDialog(null, "o valor de X é : " + valorX + " , 0 " );
       }
       else
       {
           JOptionPane.showMessageDialog(null, "INVÁLIDO ");
       }
    }
    
}
