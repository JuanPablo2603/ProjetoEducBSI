/*
 var
    numero, numeroAdv, tentativas: inteiro

inicio
    tentativas <- 0

    escreva("Defina o número a ser adivinhado: ")
    leia(numero)

    repita
        escreva("Tente adivinhar o número: ")
        leia(numeroAdv)
        tentativas <- tentativas + 1 // Conta cada tentativa

        se (numeroAdv = numero) então
            escreva("Parabéns! Você acertou em ", tentativas, " tentativas.\n")
            pare // Sai do loop ao acertar
        senão
            se (numeroAdv < numero) então
                escreva("Tente novamente! Dica: O número é maior.\n")
            senão
                escreva("Tente novamente! Dica: O número é menor.\n")
            fimse
        fimse
    até que (falso) // Loop infinito, só sai com o comando "pare"
fimalgoritmo


 */
package ex.pkg3.questao16;
import javax.swing.JOptionPane;
public class Ex3Questao16 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, numeroAdv, tentativas = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Defina o número a ser adivinhado"));
        
        do {
            numeroAdv = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número:"));
            tentativas++; // Conta cada tentativa
            
            if (numeroAdv == numero) {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou em " + tentativas + " tentativas.");
                break; // Sai do loop ao acertar
            } else if (numeroAdv < numero) {
                JOptionPane.showMessageDialog(null, "Tente novamente! Dica: O número é maior.");
            } else {
                JOptionPane.showMessageDialog(null, "Tente novamente! Dica: O número é menor.");
            }
        } while (true); // Loop continua até o jogador acertar
    }
}