/*
VAR
INICIO
hamburgueres,queijo,rodela,presunto;

LEIA
"pesodoqueijo"
"pesodarodela"
"pesodopresunto"

ESCREVA
"QUANTOS HAMBURGUERES VOCE QUER FAZER"
"PARA FAZER X HAMBURGUERES VOCE VAI PRECISAR DE X QUEIJO + X RODELA + X PRESUNTO")

FIM

TESTE DE MESA

HAMBURGUERES // QUEIJO // RODELA // PRESUNTO
8               0.8        0.8       0.4
10              1.5         1.5    
*/
import javax.swing.JOptionPane;


public class Ex16  {
    public static void main(String[] args) {
        // Solicitar ao usuário o número de hambúrgueres
        int quantidadeHamburgueres = Integer.parseInt(
            JOptionPane.showInputDialog("Quantos hambúrgueres você quer fazer?")
        );

        // Definir o peso de cada ingrediente (em quilos)
        double pesoQueijoPorHamburguer = 0.05; // 50 gramas é 0.05 kg
        double pesoRodelaPorHamburguer = 0.1; // 100 gramas é 0.1 kg
        double pesoPresuntoPorHamburguer = 0.05;// 50 grama é 0.05
        // Calcular a quantidade total de queijo e carne
        double totalQueijo = quantidadeHamburgueres * (pesoQueijoPorHamburguer + pesoQueijoPorHamburguer);
        double totalRodela = quantidadeHamburgueres * pesoRodelaPorHamburguer;
        double totalPresunto = quantidadeHamburgueres * pesoPresuntoPorHamburguer;

        // Exibir o resultado ao usuário
        JOptionPane.showMessageDialog(null,
            "Para fazer " + quantidadeHamburgueres + " hambúrguer(es), você vai precisar de:\n" +
            "- " + totalQueijo + " kg de queijo\n" +
            "- " + totalRodela + " kg de carne\n " + " - " + totalPresunto  + " kg de presunto "
        );
    }
}

                
        
    
    
