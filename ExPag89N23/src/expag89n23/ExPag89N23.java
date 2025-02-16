/*

var
    X, Y, Z: inteiro

inicio

   
    X <- 10
    Y <- 12
    Z <- X + Y

    X <- X * 8
    Y <- Y * 8

   
    se Z < X entao
        X <- X + 1
    senao se Z > Y entao
        Z <- Z + 1
    senao
        Y <- Z
    fimse

   
    Z <- Z + 1

    escreva("O valor de X é: ", X)
    escreva("O valor de Y é: ", Y)
    escreva("O valor de Z é: ", Z)

FIM
Teste de Mesa
Passo	X	Y	Z	Condição	Ação
1	10	12	-	-	Inicialização
2	10	12	22	-	Z = X + Y
3	80	96	22	-	X = X * 8, Y = Y * 8
4	80	96	22	Z < X? (22 < 80)	Sim: X = X + 1
5	81	96	22	-	Incremento final: Z = Z + 1
6	81	96	23	-	Exibição dos valores

 */
package expag89n23;

import javax.swing.JOptionPane;
public class ExPag89N23 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int X, Y, Z;

        X = 10;
        Y = 12;
        Z = X + Y;

        X = X * 8;
        Y = Y * 8;

        if (Z < X) {
            X = X + 1;
        } else if (Z > Y) {
            Z = Z + 1;
        } else {
            Y = Z;
        }

        Z = Z + 1;

        JOptionPane.showMessageDialog(null, "O valor de X é: " + X + 
                                            "\nO valor de Y é: " + Y + 
                                            "\nO valor de Z é: " + Z);
    }
}