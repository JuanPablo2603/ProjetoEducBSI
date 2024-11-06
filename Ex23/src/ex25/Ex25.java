/*
algoritmo "CalculoVolumeCaixaDAgua"
variáveis
    real volume, raio2, altura
    cadeia sraio2, saltura
início
    // Entrada de dados
    escreva("Digite o valor do raio: ")
    leia(sraio2)
    raio2 <- real(sraio2)

    escreva("Digite o valor da altura: ")
    leia(saltura)
    altura <- real(saltura)

    // Cálculo do volume
    volume <- (raio2 * raio2) * altura * 3.14

    // Saída do resultado
    escreva("O volume da caixa d'água é: ", volume)
FIM

TESTE DE MESA

RAIO // ALTURA // VOLUME // ESCREVA
4        4         200.96    200.96
3.5     8.14       313        313

 
 */
package ex25;
import javax.swing.JOptionPane;
public class Ex25 {

    
    public static void main(String[] args) {
        double volume,raio2,altura;
        
        String sraio2,saltura;
        
        sraio2 = JOptionPane.showInputDialog(null," Valor do raio ");
        raio2 = Double.parseDouble(sraio2);
        
        saltura = JOptionPane.showInputDialog(null," Valor da altura ");
        altura = Double.parseDouble(saltura);
        
        volume = (raio2*raio2)*altura*3.14;
        
        JOptionPane.showMessageDialog(null,"O volume da caixa D'Água é " + volume);
        
    }
    
}
