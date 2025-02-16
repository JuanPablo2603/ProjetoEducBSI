/*
var
    x, y, resultado: inteiro

inicio

    escreva("Digite o valor de X: ")
    leia(x)

    escreva("Digite o valor de Y: ")
    leia(y)

   
    resultado <- 2 * x + y

 
    se resultado = 3 entao
        escreva("PERTENCE")
        escreva("A = (", x, ",", y, ")")
        escreva("B = (", x, ",", y, ")")
    senao
        escreva("NAO PERTENCE")
    fimse

    FIM
Teste de Mesa
X	Y	Resultado (2*X + Y)	Pertence?	Saída
1	1	3	PERTENCE	"PERTENCE"
"A = (1,1)"
"B = (1,1)"
2	2	6	NAO PERTENCE	"NAO PERTENCE"
0	3	3	PERTENCE	"PERTENCE"
"A = (0,3)"
"B = (0,3)"
-1	5	3	PERTENCE	"PERTENCE"
"A = (-1,5)"
"B = (-1,5)"
3	-3	3	PERTENCE	"PERTENCE"
"A = (3,-3)"
"B = (3,-3)"
 
 */
package expag89n25;

import javax.swing.JOptionPane;


public class ExPag89N25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y,result,a,b;
        String s_x,s_y,s_a,s_b;
        
        s_x = JOptionPane.showInputDialog(" Digite o valor de X ");
        x = Integer.parseInt(s_x);
        s_y = JOptionPane.showInputDialog(" Digite o valor de Y ");
         y = Integer.parseInt(s_y);

         result = 2*x+y;
         if(result==3)
                 {
                    JOptionPane.showMessageDialog(null, " PERTENCE ");
                     JOptionPane.showMessageDialog(null, " A = ("+x + "," + y + ")");
                     JOptionPane.showMessageDialog(null, " B = ("+x + "," + y + ")");
                 }
         else
         {
             JOptionPane.showMessageDialog(null, " NAO PERTENCE ");
         }
    }
    
}



