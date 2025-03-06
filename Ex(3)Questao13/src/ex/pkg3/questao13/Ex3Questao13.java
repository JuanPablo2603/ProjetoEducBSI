/*
var
    valores, soma, i: inteiro
    input: cadeia

inicio
    valores <- 1999
    soma <- 0
    input <- ""

    // Loop de 1000 até 1999
    para i <- 1000 até valores faça
        soma <- soma + (valores / 11)
        
        se (i % 11 = 0) então
            input <- input + inteiro_para_cadeia(i) + "\n"
        fimse
    fimpara

    escreva(input)
fimalgoritmo

1001
1012
1023
1034
...
1980
1991
 */
package ex.pkg3.questao13;
import javax.swing.JOptionPane;
public class Ex3Questao13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int valores=1999;
     int soma=0;
     String input = " ";
     for(int i=1000; i<=valores;i++){
         soma+=valores/11 ;
         if(i % 11 ==0){
         input += i+"\n" ;
        
                     } 
     }  JOptionPane.showMessageDialog(null, "Números divisíveis por 11 entre 1000 e 1999:\n" + input ) ;
     
    }
    
}
