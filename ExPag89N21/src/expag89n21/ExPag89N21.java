/*
var
    salario, diferenca, novoSalario: real
    cargo: caractere

inicio

    // Entrada de dados
    escreva("Digite aqui o salário: ")
    leia(salario)

    escreva("Digite aqui o seu cargo: \n1- Gerente \n2- Analista \n3- Técnico \n")
    leia(cargo)

    // Lógica de cálculo
    escolha cargo
        caso "Gerente":
            se salario >= 0 entao
                novoSalario <- salario + salario * 0.1
                diferenca <- novoSalario - salario
                escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)
            senao
                escreva("Salário inválido.")
            fimse

        caso "Analista":
            se salario >= 0 entao
                novoSalario <- salario + salario * 0.2
                diferenca <- novoSalario - salario
                escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)
            senao
                escreva("Salário inválido.")
            fimse

        caso "Técnico":
            se salario >= 0 entao
                novoSalario <- salario + salario * 0.3
                diferenca <- novoSalario - salario
                escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)
            senao
                escreva("Salário inválido.")
            fimse

        outrocaso:
            se salario >= 0 entao
                novoSalario <- salario + salario * 0.355
                diferenca <- novoSalario - salario
                escreva("Seu salário que era de: R$", salario, " agora é de: R$", novoSalario, ". E a diferença é: R$", diferenca)
            senao
                escreva("Salário inválido.")
            fimse
    FIM

TESTE DE MESA 
SALARIO // CARGO // NOVO SALARIO // DIFERENÇA
1200   //   GERENTE  // 1320         120
1550   // Analista  // 1860          310
1320    //Técnico   //1716    //     396       
-1500    //  QUALQUER // INVÁLIDO     -
 */
package expag89n21;
import javax.swing.JOptionPane;
public class ExPag89N21 {

    
    public static void main(String[] args) {
        double salario, diferenca;
        String s_salario, cargo;
        s_salario = JOptionPane.showInputDialog("Digite aqui o salário:");
        salario = Double.parseDouble(s_salario);

        cargo = JOptionPane.showInputDialog("Digite aqui o seu cargo: \n1- Gerente \n2- Analista \n3- Técnico");

        
        switch (cargo) {
            case "Gerente" -> {
                if (salario >= 0) {
                    double novoSalario = salario + salario * 0.1;
                    diferenca = novoSalario - salario;
                    JOptionPane.showMessageDialog(null, "Seu salário que era de: R$" + salario +
                            " agora é de: R$" + novoSalario +
                            ". E a diferença é: R$" + diferenca);
                } else {
                    JOptionPane.showMessageDialog(null, "Salário inválido.");
                }
            }
            case "Analista" -> {
                if (salario >= 0) {
                    double novoSalario = salario + salario * 0.2;
                    diferenca = novoSalario - salario;
                    JOptionPane.showMessageDialog(null, "Seu salário que era de: R$" + salario +
                            " agora é de: R$" + novoSalario +
                            ". E a diferença é: R$" + diferenca);
                } else {
                    JOptionPane.showMessageDialog(null, "Salário inválido.");
                }
            }
            case "Técnico" -> {
                if (salario >= 0) {
                    double novoSalario = salario + salario * 0.3;
                    diferenca = novoSalario - salario;
                    JOptionPane.showMessageDialog(null, "Seu salário que era de: R$" + salario +
                            " agora é de: R$" + novoSalario +
                            ". E a diferença é: R$" + diferenca);
                } else {
                    JOptionPane.showMessageDialog(null, "Salário inválido.");
                }
            }
            default -> { 
                if (salario >= 0) {
                    double novoSalario = salario + salario * 35.5/100;
                    diferenca = novoSalario - salario;
                    JOptionPane.showMessageDialog(null, "Seu salário que era de: R$" + salario +
                            " agora é de: R$" + novoSalario +
                            ". E a diferença é: R$" + diferenca);
                } else {
                    JOptionPane.showMessageDialog(null, "Salário inválido.");
                }
        }
    }
}}
