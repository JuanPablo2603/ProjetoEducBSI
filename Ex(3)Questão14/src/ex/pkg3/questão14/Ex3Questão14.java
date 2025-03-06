/*
programa
var
    totalAlunos, qtdMulheres, i: inteiro
    altura, somaAltura, somaAltFem, altMaior, altMenor, media, mediaFem: real
    sexo: caractere

inicio
    totalAlunos <- 50
    somaAltura <- 0
    somaAltFem <- 0
    qtdMulheres <- 0
    altMaior <- -9999.0 // Simulando Double.MIN_VALUE
    altMenor <-  9999.0 // Simulando Double.MAX_VALUE

    // Loop para receber os dados dos alunos
    para i <- 1 até totalAlunos faça
        escreva("Qual a altura do aluno ", i, "? ")
        leia(altura)
        
        escreva("Qual o sexo do aluno ", i, "? (M para masculino - F para feminino): ")
        leia(sexo)
        
        // Atualizando maior e menor altura
        se (altura > altMaior) então
            altMaior <- altura
        fimse

        se (altura < altMenor) então
            altMenor <- altura
        fimse

        // Somando todas as alturas para calcular a média geral
        somaAltura <- somaAltura + altura

        // Somando alturas femininas para calcular a média feminina
        se (sexo = "F") então
            somaAltFem <- somaAltFem + altura
            qtdMulheres <- qtdMulheres + 1
        fimse
    fimpara

    // Cálculo das médias
    media <- somaAltura / totalAlunos
    se (qtdMulheres > 0) então
        mediaFem <- somaAltFem / qtdMulheres
    senão
        mediaFem <- 0
    fimse

    // Exibição dos resultados
    escreva("Maior altura da turma: ", altMaior, "\n")
    escreva("Menor altura da turma: ", altMenor, "\n")
    escreva("Média da altura feminina: ", mediaFem, "\n")
    escreva("Média da altura da turma: ", media, "\n")
fimalgoritmo

Teste de Mesa
Iteração Altura	Sexo	Maior	Menor	Soma Total Soma Feminino Nº Mulheres
1ª	 1	M	1	1.	1	  0,00	             0
2ª	 1.6	F	1,75	1,62	3.37	  1,62	             1
3ª	 1	M	1,80	1,62	5.	  1,62	             1
4ª	 1,58	F	1,80	1,58	6,75	   3	             2
5ª	 1.	F	1,80	1.5	8.43	  4,88	             3
 */
package ex.pkg3.questão14;

import javax.swing.JOptionPane;


public class Ex3Questão14 {

    
    public static void main(String[] args) {
        int totalAlunos =50;
       double altura, somaAltura=0;
       double somaAltFem=0;
       double altMaior = Double.MIN_VALUE;
       double altMenor = Double.MAX_VALUE;
     
       for(int i = 1; i<=totalAlunos;i++){
           altura = Double.parseDouble(JOptionPane.showInputDialog("qual a altura do aluno?" +i +":"));
           String sexo = JOptionPane.showInputDialog("Qual o sexo do aluno :" +i + "M para masculino - F para feminino");
          
           
           if(altura>altMaior){
               altMaior = altura;
           }
           if(altura<altMenor){
               altMenor = altura;
               somaAltura += altura;
           }
           if(sexo.equals("F"))
           {
               somaAltFem+=altura;
               
           }
           double media = altura /totalAlunos;
          double mediafem = somaAltFem / totalAlunos;
          String resultado = "Maior altura da turma " +altMaior +
                  "\n menor altura " +altMenor+
                  "\n media altura feminina " + mediafem +
                  "\n Media da turma " + media;
                 JOptionPane.showMessageDialog(null, resultado);

       }
    }
}   

