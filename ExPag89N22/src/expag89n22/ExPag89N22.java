/*
 algoritmo "CalculaMediaAproveitamento"

var
    numero_aluno: inteiro
    nota1, nota2, nota3, mE, mA: real
    s_numero_aluno, s_nota1, s_nota2, s_nota3: caractere

inicio

    // Entrada de dados
    escreva("Digite o Número de Identificação do Aluno \n1 - Pedro \n2 - Alice \n3 - Joao: ")
    leia(numero_aluno)

    escreva("Digite a primeira nota: ")
    leia(nota1)

    escreva("Digite a segunda nota: ")
    leia(nota2)

    escreva("Digite a terceira nota: ")
    leia(nota3)

    // Cálculo das médias
    mE <- (nota1 + nota2 + nota3) / 3
    mA <- (nota1 + (nota2 * 2) + (nota3 * 3) + mE) / 7

    // Verificação do número do aluno e cálculo do conceito
    escolha numero_aluno
        caso 1:
            se mA >= 9 entao
                escreva("O aluno de numeração 1 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota A")
            senao se mA >= 7.5 e mA < 9.0 entao
                escreva("O aluno de numeração 1 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota B")
            senao se mA >= 6.0 e mA < 7.5 entao
                escreva("O aluno de numeração 1 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota C")
            senao se mA >= 4.0 e mA < 6.0 entao
                escreva("O aluno de numeração 1 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota D")
            senao se mA < 4.0 entao
                escreva("O aluno de numeração 1 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota E")
            senao
                escreva("MA Inválido")
            fimse

        caso 2:
            se mA >= 9 entao
                escreva("O aluno de numeração 2 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota A")
            senao se mA >= 7.5 e mA < 9.0 entao
                escreva("O aluno de numeração 2 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota B")
            senao se mA >= 6.0 e mA < 7.5 entao
                escreva("O aluno de numeração 2 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota C")
            senao se mA >= 4.0 e mA < 6.0 entao
                escreva("O aluno de numeração 2 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota D")
            senao se mA < 4.0 entao
                escreva("O aluno de numeração 2 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota E")
            senao
                escreva("MA Inválido")
            fimse

        caso 3:
            se mA >= 9 entao
                escreva("O aluno de numeração 3 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota A")
            senao se mA >= 7.5 e mA < 9.0 entao
                escreva("O aluno de numeração 3 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota B")
            senao se mA >= 6.0 e mA < 7.5 entao
                escreva("O aluno de numeração 3 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Aprovado com nota de Aproveitamento ", mA, " com Nota C")
            senao se mA >= 4.0 e mA < 6.0 entao
                escreva("O aluno de numeração 3 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota D")
            senao se mA < 4.0 entao
                escreva("O aluno de numeração 3 com nota ", nota1, " ", nota2, " ", nota3, " teve média de exercício ", mE, " foi Reprovado com nota de Aproveitamento ", mA, " com Nota E")
            senao
                escreva("MA Inválido")
            fimse

        outrocaso:
            escreva("Aluno Inválido")
    fimescolha

FIM

TESTE DE MESA 

Número do Aluno	Nota1	Nota2	Nota3	Média Exercícios (mE)	Média Aproveitamento (mA)	Conceito
1	8.0	9.0	7.0	8.0	7.86	B
2	6.0	5.0	4.0	5.0	4.71	D
3	10.0	9.5	9.0	9.5	9.36	A
4	3.0	2.0	1.0	2.0	1.71	E
5	-	-	-	-	-	Inválido
 */
package expag89n22;
import javax.swing.JOptionPane;
public class ExPag89N22 {

    
   
    public static void main(String[] args) {
        // TODO code application logic here
        int numero_aluno;
        float nota1,nota2,nota3,mE,mA;
        String s_numero_aluno,s_nota1,s_nota2,s_nota3,conceito;
        
        s_numero_aluno = JOptionPane.showInputDialog(null, "Digite o Número de Indentificação do Aluno \n1 - Pedro \n2 - Alice \n3 - Joao");
        numero_aluno = Integer.parseInt(s_numero_aluno);
        s_nota1 = JOptionPane.showInputDialog(null, "Digite a primeira");
        nota1 = Float.parseFloat(s_nota1);
        s_nota2 = JOptionPane.showInputDialog(null, "Digite a segunda");
        nota2 = Float.parseFloat(s_nota2);
        s_nota3 = JOptionPane.showInputDialog(null, "Digite a terceira");
        nota3 = Float.parseFloat(s_nota2);
        
        mE = (nota1+nota2+nota3)/3;
        mA = ((nota1+(nota2+nota2)+(nota3+nota3+nota3)+mE)/7);

       if (numero_aluno == 1)
        {
            if(mA >=9)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 1 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota A ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 7.5) && (mA < 9.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 1 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota B ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 6.0) && (mA < 7.5))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 1 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota C ",+ nota1,nota2,nota3,mE,mA));    
            }
            else if ((mA >= 4.0) && (mA <6.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 1 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota D ",+ nota1,nota2,nota3,mE,mA));
            }
            else if (mA < 4.0)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 1 com nota %.1f  %.1f %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota E ",+ nota1,nota2,nota3,mE,mA));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"MA Inválido");
            }
        
            
        }
       else if (numero_aluno == 2)
        {
          if(mA >=9)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 2 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota A ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 7.5) && (mA < 9.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 2 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota B ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 6.0) && (mA < 7.5))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 2 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota C ",+ nota1,nota2,nota3,mE,mA));    
            }
            else if ((mA >= 4.0) && (mA <6.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 2 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota D ",+ nota1,nota2,nota3,mE,mA));
            }
            else if (mA < 4.0)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 2 com nota %.1f  %.1f %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota E ",+ nota1,nota2,nota3,mE,mA));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"MA Inválido");
            }          
        }
        else if (numero_aluno == 3)
        {
          if(mA >=9)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 3 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota A ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 7.5) && (mA < 9.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 3 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota B ",+ nota1,nota2,nota3,mE,mA));
            }
            else if ((mA >= 6.0) && (mA < 7.5))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 3 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Aprovado com nova de Aproveitamento %.1f com Nota C ",+ nota1,nota2,nota3,mE,mA));    
            }
            else if ((mA >= 4.0) && (mA <6.0))
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 3 com nota %.1f  %.1f  %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota D ",+ nota1,nota2,nota3,mE,mA));
            }
            else if (mA < 4.0)
            {
                JOptionPane.showMessageDialog(null, String.format("O aluno de numeração 3 com nota %.1f  %.1f %.1f teve media de exercicio %.1f foi Reprovado com nova de Aproveitamento %.1f com Nota E ",+ nota1,nota2,nota3,mE,mA));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"MA Inválido");
            }  
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Aluno Inválido");
        }
       }
                
    }