/*
 var
    garrafao, furo: real
    horas: inteiro
inicio
    garrafao <- 20000
    furo <- 300
    horas <- 0
    
    enquanto garrafao > 0 faca
        garrafao <- garrafao - furo
        horas <- horas + 1
    fimenquanto
    
    escreva("Foi esvaziado às ", horas, " horas")
fimalgoritmo

Tabela de Teste de Mesa:
Iteração Garrafão (ml)	Horas
1ª	19700	         1,0
2ª	19400	         2,0
3ª	19100	         3,0
4ª	18800	         4,0
5ª	18500	         5,0
...	...	         ...
66ª	200	        66,0
67ª	-100	        67,0

 */
package ex.pkg3.questão18;
import javax.swing.JOptionPane;
public class Ex3Questão18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double garrafao = 20000, furo = 300, horas = 0;
       while(garrafao>0){
           garrafao -= furo;
           horas += 1;
       }
               JOptionPane.showMessageDialog(null, "Foi esvaziado às " + horas + " horas ");
               }
}

