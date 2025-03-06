/*
 var
    valores, numeros, soma, maior, menor, i: inteiro
    media: real

inicio
    valores <- 10
    soma <- 0
    maior <- -99999  // Simulando Integer.MIN_VALUE
    menor <-  99999  // Simulando Integer.MAX_VALUE

    para i <- 1 até valores faça
        escreva("Insira o número ", i, ": ")
        leia(numeros)

        se (numeros > 0) então
            se (numeros > maior) então
                maior <- numeros
            fimse
            se (numeros < menor) então
                menor <- numeros
            fimse
            soma <- soma + numeros
        senão
            escreva("Por favor, insira um número positivo\n")
            i <- i - 1  // Para repetir a entrada
        fimse
    fimpara

    se (valores > 0) então
        media <- soma / valores
    senão
        media <- 0
    fimse

Iteração Entrada maior	menor	soma	mídia
1ª	5	5	5	5	0,5
2ª	10	10	5	15	1.5
3ª	8	10	5	23	2.3
4ª	3	10	3	26	2.6
5ª	15	15	3	41	4.1
6ª	20	20	3	61	6.1
7ª	7	20	3	68	6.8
8ª	2	20	2	70	7.0
9ª	14	20	2	84	8.4
10ª	9	20	2	93	9.3
 */
package ex.pkg3.questao12;
import javax.swing.JOptionPane;
public class Ex3Questao12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int valores = 10;
       int numeros,soma=0;
       int maior =Integer.MIN_VALUE;
       int menor = Integer.MAX_VALUE;
       for (int i = 1; i<=valores;i++){
           numeros = Integer.parseInt(JOptionPane.showInputDialog("Insira os numeros" + i + ":"));
           if(numeros>0){
               
           if(numeros>maior){
             maior = numeros;
           }
           if(numeros<menor){
               menor = numeros;
           }
           soma +=numeros;
       }
           else {
               JOptionPane.showMessageDialog(null, "Por favor insira um numero positivo");
               i--;
           }
           double media = (i>0) ? (double) soma/i:0;
           String resultado = ( "Maior valor :" + maior+
             "\nmenor valor" + menor +
             "\nmedia" + media       
                    );
           JOptionPane.showMessageDialog(null, resultado);
    }
    
}
}
