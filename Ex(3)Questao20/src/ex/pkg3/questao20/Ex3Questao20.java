/*
 var
    votosFirmino, votosEugenia, votosNulos, votosBrancos, totalEleitores, voto: inteiro
    vencedor: texto
inicio
    votosFirmino <- 0
    votosEugenia <- 0
    votosNulos <- 0
    votosBrancos <- 0
    totalEleitores <- 0
    
    enquanto verdadeiro faça
        escreva("Eleitor ", totalEleitores + 1, " Escolha seu voto:")
        escreva("1 - Eugenia")
        escreva("2 - Firmino")
        escreva("0 - Branco")
        escreva("9 - Nulo")
        leia(voto)
        
        se voto == -1 então
            interrompa
        fimse
        
        totalEleitores <- totalEleitores + 1
        
        escolha voto
            caso 1:
                votosEugenia <- votosEugenia + 1
            caso 2:
                votosFirmino <- votosFirmino + 1
            caso 0:
                votosBrancos <- votosBrancos + 1
            caso 9:
                votosNulos <- votosNulos + 1
            outrocaso:
                escreva("Voto inválido! Tente novamente.")
                totalEleitores <- totalEleitores - 1
        fimescolha
    fimenquanto
    
    se votosEugenia > votosFirmino então
        vencedor <- "Eugenia"
    senão se votosFirmino > votosEugenia então
        vencedor <- "Firmino"
    senão
        escreva("Empate!")
    fimse
    
    escreva("Resultados da Votação:")
    escreva("Eugenia: ", votosEugenia, " votos")
    escreva("Firmino: ", votosFirmino, " votos")
    escreva("Brancos: ", votosBrancos, " votos")
    escreva("Nulos: ", votosNulos, " votos")
    escreva("Total de eleitores: ", totalEleitores)
    escreva("Vencedor: ", vencedor)
fimalgoritmo

Teste de Mesa
Eleitor	Voto     
1	1
2	2
3	1
4	9
5	0
6	-1
Candidato/Voto	Quantidade
Eugenia	        2 votos
Firmino	         1 voto
Brancos	         1 voto
Nulos	         1 voto
Total Eleitores	5
Vencedor: Eugenia (com 2 votos).

 */
package ex.pkg3.questao20;
import javax.swing.JOptionPane;
public class Ex3Questao20 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int votosFirmino = 0, votosEugenia = 0, votosNulos =0, votosBrancos =0, totalEleitores = 0;
        while(true){
            int voto = Integer.parseInt(JOptionPane.showInputDialog("Eleitor " + (totalEleitores +1) +
                    "Escolha seu voto \n" + "1 - Eugenia\n " +
                    "2 - Firmino\n" +
                     "0 - Branco\n" +
                     "9 - nuko\n"));
            if(voto == -1){
                break;
            }
            totalEleitores++;
            switch(voto){
            case 1 -> votosEugenia++;
            case 2 -> votosFirmino++;
            case 0 -> votosBrancos++;
            case 9 -> votosNulos++;
            default -> {
                JOptionPane.showMessageDialog(null, "Voto inválido ! tente novamente " );
                totalEleitores--;
                }
        }
        }
        String vencedor = null;
        if(votosEugenia>votosFirmino){
           vencedor = "Eugenia ";
        }
        else if(votosFirmino>votosEugenia){
            vencedor = " Firmino ";
        }
        else {
            JOptionPane.showMessageDialog(null, "Empate ");
        } JOptionPane.showMessageDialog(null,
            "Resultados da Votação:\n" +
            "Eugenia: " + votosEugenia + " votos\n" +
            "Firmino: " + votosFirmino + " votos\n" +
            "Brancos: " + votosBrancos + " votos\n" +
            "Nulos: " + votosNulos + " votos\n" +
            "Total de eleitores: " + totalEleitores + "\n" +
            "Vencedor: " + vencedor);
}
    }       
