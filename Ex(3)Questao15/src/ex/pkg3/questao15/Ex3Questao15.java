/*
 var
    limite, i, j, somaDivisores: inteiro
    numerosPerfeitos: cadeia

inicio
    limite <- 100000 // Define o limite até onde queremos verificar números perfeitos
    numerosPerfeitos <- ""

    // Loop para verificar números perfeitos
    para i <- 1 até limite faça
        somaDivisores <- 0

        // Encontra os divisores próprios de i e soma eles
        para j <- 1 até (i / 2) faça
            se (i % j = 0) então
                somaDivisores <- somaDivisores + j
            fimse
        fimpara

        // Verifica se a soma dos divisores é igual ao número i
        se (somaDivisores = i) então
            numerosPerfeitos <- numerosPerfeitos + inteiro_para_cadeia(i) + " "
        fimse
    fimpara

    // Exibe os números perfeitos encontrados
    escreva("Números perfeitos até ", limite, ": ", numerosPerfeitos, "\n")
fimalgoritmo

Teste de mesa 
1 / 2 / 3 / 4 / 5
6 /28/496/8128/

 */
package ex.pkg3.questao15;

import javax.swing.JOptionPane;
public class Ex3Questao15 {


    public static void main(String[] args) {
       int limite = 100000; // Defina o limite até onde você quer verificar números perfeitos
        String numerosPerfeitos = "";
        int contador =0;

        for (int i = 1; i <= limite; i++) {
            int somaDivisores = 0;

            // Encontra os divisores próprios de i e soma eles
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    somaDivisores += j;
                }
            }

            // Verifica se a soma dos divisores é igual ao número i
            if (somaDivisores == i) {
                numerosPerfeitos += i + " ";
                i++;
            }
        }

        // Exibe os números perfeitos encontrados
        JOptionPane.showMessageDialog(null, "Números perfeitos até " + limite + ": " + numerosPerfeitos);
    }
}
