/*
var
    a, b, soma, n1, i: inteiro
    resultado: texto
inicio
    a <- 0
    b <- 1
    resultado <- ""
    
    escreva("Digite até onde você quer que vá: ")
    leia(n1)
    
    se (n1 == 1) ou (n1 == 2) então
        escreva(a, " ", b, " ")
    senão
        para i de 1 até n1 faça
            soma <- a
            a <- a + b
            resultado <- resultado + soma + " "
            b <- soma
        fimpara
    fimse
    
    escreva("A sequência até ", n1, " é: ", resultado)
fimalgoritmo

teste de mesa

Iteração(i) soma a	b	resultado
1	    0	 1	0	"0 "
2	    1	 1	1	"0 1 "
3	    1	 2	1	"0 1 1 "
4	    2	 3	2	"0 1 1 2 "
5	    3	 5	3	"0 1 1 2 3 "

 */
package ex.pkg3.questao19;

import javax.swing.JOptionPane;


public class Ex3Questao19 {

   
    public static void main(String[] args) {
        String result = "";
        int i, n1=0,soma=0;
        int a = 0, b= 1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite até onde vocer quer que vá"));
        JOptionPane.showMessageDialog(null, "a sequencia ira até "+ n1 + ":");
        if((n1 == 1)&&(n1==2))
            {
                JOptionPane.showMessageDialog(null, a +" " + b + " ");
            }
        for( i =1; i<=n1;i++){
            
            soma = a;
            a = a +b;
            result = result + soma +" ";
            b = soma;
            
        }
        JOptionPane.showMessageDialog(null, result + " ");
    }
    
}

    
   