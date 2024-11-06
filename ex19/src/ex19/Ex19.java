/* Declaração de variáveis
declare anelchip, anelalimentos, gasto, frangos: real
declare s_frangos: cadeia

// Atribuição dos valores para cada tipo de anel
anelchip <- 4.0
anelalimentos <- 3.50

// Entrada de dados
escreva("Quantidade de frangos: ")
leia(s_frangos)
frangos <- converteReal(s_frangos)

// Cálculo do gasto total
gasto <- frangos * (anelchip + anelalimentos)

// Exibe o resultado
escreva("O GASTO FOI ", gasto)

Teste de Mesa

Frangos // Gasto // escreva
  8        15.5     15.5
  5        12.5     12.5

*/
package ex19;

import javax.swing.JOptionPane;


public class Ex19 {

    
    public static void main(String[] args) {
      double anelchip = 4, anelalimentos = 3.50, gasto, frangos;
      
      String s_frangos;
      s_frangos = JOptionPane.showInputDialog(null, " quantidade de frangos ");
      frangos = Double.parseDouble(s_frangos);
      
      gasto = frangos + anelchip + anelalimentos;
      
      JOptionPane.showMessageDialog(null,"O GASTO FOI " + gasto);
      
   
    }
    
}
