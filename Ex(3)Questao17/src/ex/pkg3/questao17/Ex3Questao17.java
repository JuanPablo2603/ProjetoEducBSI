/*
 var
    garrafao, furo, horas: real

inicio
    garrafao <- 20000 // Capacidade total do garrafão
    furo <- 50 // Vazamento a cada 0.5 hora
    horas <- 0

    // Enquanto houver água no garrafão, ele continua vazando
    enquanto (garrafao > 0) faça
        garrafao <- garrafao - furo
        horas <- horas + 0.5
    fimenquanto

    escreva("Foi esvaziado às ", horas, " horas.\n")
fimalgoritmo

Iteração Garrafão(ml)	Horas
1ª	 199	        0,5
2ª	 19	        1.0
...	 ...	        ...
400ª	 0	       200,0
 */
package ex.pkg3.questao17;
import javax.swing.JOptionPane;
public class Ex3Questao17 {
    public static void main(String[] args) {
        // TODO code application logic here
       double garrafao = 20000, furo = 50, horas = 0;
       while(garrafao>0){
           garrafao -= furo;
           horas += 0.5;
       }
               JOptionPane.showMessageDialog(null, "Foi esvaziado às " + horas + " horas ");
               }
}