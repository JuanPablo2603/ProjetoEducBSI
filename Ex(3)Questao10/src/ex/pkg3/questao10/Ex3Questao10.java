/*
 var
    A, negativos, i: inteiro

inicio
    negativos <- 0

    // LOOP
    para i <- 0 até 4 faça
        escreva("Digite o valor: ")
        leia(A)
        
        se (A < 0) então
            negativos <- negativos + 1
        fimse
    fimpara

    escreva("Os valores negativos são exatamente: ", negativos)
fimalgoritmo

teste de mesa 

Iteração Entrada (A) negativos
 1	 10	       0
 2	 -5	       1
 3ª	 -3	       2
 4ª	 7	       2
 5ª	 -	       3
 */
package ex.pkg3.questao10;
import javax.swing.JOptionPane;
public class Ex3Questao10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
       int negativos = 0;
       //LOOP
       for(int i =0;i<5;i++){
           A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor" ));
           if(A<0){
              negativos++;
           }
       
       } 
       JOptionPane.showMessageDialog(null, " Os valores negativos são exatamente: " +negativos);
    }
    
}
