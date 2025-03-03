/*
var
    car: caractere

inicio

    // Entrada de dados
    escreva("Digite o Caractere: ")
    leia(car)

    // Verificação se é vogal
    se (car = "a") ou (car = "e") ou (car = "i") ou (car = "o") ou (car = "u") entao
        escreva("O Caractere é uma Vogal")
    senao se (car = "b") ou (car = "c") ou (car = "d") ou (car = "f") ou (car = "g") ou (car = "h") ou (car = "j") ou (car = "k") ou (car = "l") ou (car = "m") ou (car = "n") ou (car = "p") ou (car = "q") ou (car = "r") ou (car = "s") ou (car = "t") ou (car = "v") ou (car = "w") ou (car = "x") ou (car = "y") ou (car = "z") entao
        escreva("O Caractere é uma Consoante")
    senao
        escreva("O Caractere é Outro")
    fimse

   FIM
Teste de Mesa
Caractere	Tipo	Saída
a	Vogal	"O Caractere é uma Vogal"
e	Vogal	"O Caractere é uma Vogal"
b	Consoante	"O Caractere é uma Consoante"
c	Consoante	"O Caractere é uma Consoante"
z	Consoante	"O Caractere é uma Consoante"
1	Outro	"O Caractere é Outro"
@	Outro	"O Caractere é Outro"
 */
package expag89n29;
import javax.swing.JOptionPane;
public class ExPag89N29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String car;
        
        car = JOptionPane.showInputDialog("Digite o Caractere");
        
        if ( (car.equals("a")) || (car.equals("e")) || (car.equals("i")) || (car.equals("o")) || (car.equals("u")))
        {
            JOptionPane.showMessageDialog(null, "O Caractere e uma Vogal");
        }
        else if ((car.equals("b")) ||(car.equals("c")) ||(car.equals("d")) ||(car.equals("f")) ||(car.equals("g")) ||(car.equals("h")) ||(car.equals("j")) ||(car.equals("k")) ||(car.equals("l")) ||(car.equals("m")) ||(car.equals("n")) ||(car.equals("p")) ||(car.equals("q")) ||(car.equals("r")) ||(car.equals("s")) ||(car.equals("t")) ||(car.equals("v")) ||(car.equals("w")) ||(car.equals("x")) ||(car.equals("y")) ||(car.equals("z")))
        {
            JOptionPane.showMessageDialog(null, "O Caractere e uma Consoante");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O Caractere e Outro");
        }

    }
    
}
   
    
