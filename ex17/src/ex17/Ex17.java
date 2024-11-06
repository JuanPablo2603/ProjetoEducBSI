/* Declaração de variáveis
declare celsius, fahrenheit: real
declare s_celsius: cadeia

// Entrada de dados
escreva("Insira o grau em Celsius que será convertido: ")
leia(s_celsius)
celsius <- converteReal(s_celsius)

// Cálculo da conversão para Fahrenheit
fahrenheit <- celsius * 1.8 + 32

Exibe o resultado
escreva("O GRAU CONVERTIDO É ", fahrenheit)

TESTE DE MESA

CELSIUS // FAHRENHEIT // ESCREVA
50         122           122
180        356           356
10         50             50
*/





package ex17;
import javax.swing.JOptionPane;

public class Ex17 {

   
    public static void main(String[] args) {
        double celsius, fahrenheit ;
           String s_celsius;
          s_celsius = JOptionPane.showInputDialog(null," insira o grau que sera convertido ");
          celsius = Double.parseDouble(s_celsius);
          
          fahrenheit = celsius * 1.8 + 32;
          
          JOptionPane.showMessageDialog(null," O GRAU CONVERTIDO É " + fahrenheit );
            
    }
    
}
