/*
var
    a1, a2, b1, b2, x, y: real
    s_a1, s_a2, s_b1, s_b2: caractere

inicio

    escreva("Digite o Coeficiente Linear de A: ")
    leia(a1)

    escreva("Digite o Coeficiente Angular de A: ")
    leia(a2)

    escreva("Digite o Coeficiente Linear de B: ")
    leia(b1)

    escreva("Digite o Coeficiente Angular de B: ")
    leia(b2)

    se a1 = a2 entao
        se b1 = b2 entao
            escreva("As Retas são coincidentes")
        senao
            escreva("As Retas são paralelas")
        fimse
    senao
        x <- (b2 - b1) / (a1 - a2)
        y <- a1 * x + b1
        escreva("O ponto de interseção é:\nX = ", x, "\nY = ", y)
    fimse
   FIM
Teste de Mesa
a1	a2	b1	b2	Condição (a1 == a2)	Condição (b1 == b2)	Resultado
2	2	3	3	Verdadeiro	Verdadeiro	"As Retas são coincidentes"
2	2	3	4	Verdadeiro	Falso	"As Retas são paralelas"
1	2	3	4	Falso	-	"O ponto de interseção é:\nX = 1.0\nY = 4.0"
3	4	5	6	Falso	-	"O ponto de interseção é:\nX = 1.0\nY = 8.0"


 */
package expag89n26;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan
 */
public class ExPag89N26 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        double a1,a2,b1,b2;
        String s_a1,s_a2,s_b1,s_b2;
        
        s_a1 = JOptionPane.showInputDialog("Digite o Coeficiente Linear de A");
        a1 = Double.parseDouble(s_a1);
        s_a2 = JOptionPane.showInputDialog("Digite o Coeficiente Angular de A");
        a2 = Double.parseDouble(s_a2);
        s_b1 = JOptionPane.showInputDialog("Digite o Coeficiente Linear de B");
        b1 = Double.parseDouble(s_b1);
        s_b2 = JOptionPane.showInputDialog("Digite o Coeficiente Angular de B");
        b2 = Double.parseDouble(s_b2);
        
        if (a1 == a2)
        {
            if (b1 == b2)
            {
               JOptionPane.showMessageDialog(null, "As Retas são coincidentes"); 
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "As Retas são paralelas");
            }
        }
        else
        {
            double x = (b2 - b1) / (a1 - a2);
            double y = a1 * x + b1;
            JOptionPane.showMessageDialog(null, "O ponto de interseção é:\nX = " + x + "\nY = " + y);    
        }
    }
    
}