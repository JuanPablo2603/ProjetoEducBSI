/*
algoritmo "VerificaPertence"

var
    a, b, x, numero: inteiro

inicio

    // Entrada de dados
    escreva("Digite o valor de A: ")
    leia(a)

    escreva("Digite o valor de B: ")
    leia(b)

    escreva("Digite o número: ")
    leia(numero)

    // Cálculo de x
    x <- (a + b) * (a + b)

    // Verificação se x é igual ao número
    se x = numero entao
        escreva("PERTENCE")
    senao
        escreva("NAO PERTENCE")
    fimse

FIM 
Teste de Mesa
A	B	Número	X = (A + B)²	Pertence?
1	2	9	9	PERTENCE
3	4	49	49	PERTENCE
2	3	25	25	PERTENCE
5	5	100	100	PERTENCE
1	1	3	4	NAO PERTENCE
2	2	15	16	NAO PERTENCE
*/
package expag89n28;
import javax.swing.JOptionPane;

public class ExPag89N28 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,x,numero;
        String s_a, s_b,s_numero;
        s_a = JOptionPane.showInputDialog(" Digite o valor de A ");
        a = Integer.parseInt(s_a);
        
        s_b = JOptionPane.showInputDialog(" Digite o valor de B");
        b = Integer.parseInt(s_b);
        s_numero = JOptionPane.showInputDialog(" Digite o numero  ");
        numero = Integer.parseInt(s_numero);
        
         
         
        x =(a+b)*(a+b);
        if(x == numero)
        {
            JOptionPane.showMessageDialog(null, " PERTENCE ");
        }
        else 
        {
                JOptionPane.showMessageDialog(null, " NAO PERTENCE ");
                }
    }
    
}
   