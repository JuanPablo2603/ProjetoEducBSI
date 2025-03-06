/*
 var
    n, fatorial, i: inteiro

inicio
    escreva("Digite o valor a ser fatorado: ")
    leia(n)
    
    fatorial <- 1

    // LOOP para calcular o fatorial
    para i <- 1 até n faça
        fatorial <- fatorial * i
    fimpara

    escreva("O valor fatorial de ", n, " é: ", fatorial)
fimalgoritmo

Teste de Mesa

Caso 1: Entrada = 5
Iteração eu	fatorial
1	 1	1
2ª	 2	2
3	 3	6
4ª	 4	24
5	 5	120


 */
package ex.pkg3.questao11;
import javax.swing.JOptionPane;
public class Ex3Questao11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=1;
       int fatorial = 1; 
       n = Integer.parseInt(JOptionPane.showInputDialog("digite o valor a ser fatorado "));
       for(int i = 1;i<=n;i++){
          fatorial *= i;
    }
    JOptionPane.showMessageDialog(null, "O Valor fatorial de " +n+ " é :"+fatorial);
}
}