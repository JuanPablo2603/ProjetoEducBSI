/*
var
int : saldo
   string s_saldo, cliente;

inicio

    // Solicita os valores de A e B
    escreva("Digite o valor de A: ")
    leia(a)
    escreva("Digite o valor de B: ")
    leia(b)

    // Calcula o valor de X
    valorX <- -b / a

    // Verifica se A é maior que zero
    se a > 0 entao
        escreva("A reta toca o eixo X no ponto: (", valorX, ", 0)")
    senao
        escreva("INVÁLIDO")
    fim


 
 */
package expag89.n20;
import javax.swing.JOptionPane;

public class ExPag89N20 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo;
        String s_saldo,cliente;
        
        s_saldo = JOptionPane.showInputDialog("Digite o seu saldo ");
        saldo = Integer.parseInt(s_saldo);
        cliente = JOptionPane.showInputDialog("Digite o nome do cliente ");
        
        if((saldo<=200)&&(saldo>=0))
                {
                    JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " é zero ");
                }
        else if((saldo>=200)&&(saldo<=1000))
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " É " + (saldo*0.2));
        }
        else if ((saldo>=1000)&&(saldo<=2000))
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " É " + ( saldo * 0.3));
        }
        else if (saldo>2000)
        {
            JOptionPane.showMessageDialog(null, " O saldo do " + cliente + " É " + (saldo*0.4));
        }
        else
        {
            JOptionPane.showMessageDialog(null, " inválido ");
        }
    }
    
    
}
