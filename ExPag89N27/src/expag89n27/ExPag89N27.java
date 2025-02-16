/*
algoritmo "VerificaAlturasIdades"

var
    alt1, alt2, alt3, idad1, idad2, idad3, media: real
    nome1, nome2, nome3: caractere

inicio

    // Entrada de dados
    escreva("Digite o valor da Altura do primeiro: ")
    leia(alt1)

    escreva("Digite o valor da altura do segundo: ")
    leia(alt2)

    escreva("Digite o valor da altura do terceiro: ")
    leia(alt3)

    escreva("Digite a idade do primeiro: ")
    leia(idad1)

    escreva("Digite a idade do segundo: ")
    leia(idad2)

    escreva("Digite a idade do terceiro: ")
    leia(idad3)

    escreva("Digite o nome do primeiro: ")
    leia(nome1)

    escreva("Digite o nome do segundo: ")
    leia(nome2)

    escreva("Digite o nome do terceiro: ")
    leia(nome3)

    // Cálculo da média das alturas
    media <- (alt1 + alt2 + alt3) / 3

    // Verificação das alturas
    se (alt1 >= 0) e (alt2 >= 0) e (alt3 >= 0) entao
        se (alt1 > alt2) e (alt1 > alt3) entao
            escreva(nome1, " É O MAIOR")
        senao se (alt2 > alt1) e (alt2 > alt3) entao
            escreva(nome2, " É O MAIOR")
        senao se (alt3 > alt1) e (alt3 > alt2) entao
            escreva(nome3, " É O MAIOR")
        senao
            escreva("INVÁLIDO")
        fimse

        se (alt1 < alt2) e (alt1 < alt3) entao
            escreva(nome1, " É O MAIS BAIXO")
        senao se (alt2 < alt1) e (alt2 < alt3) entao
            escreva(nome2, " É O MAIS BAIXO")
        senao se (alt3 < alt1) e (alt3 < alt2) entao
            escreva(nome3, " É O MAIS BAIXO")
        senao
            escreva("INVÁLIDO")
        fimse
    fimse

    // Verificação das idades
    se (idad1 >= 0) e (idad2 >= 0) e (idad3 >= 0) entao
        se (idad1 > idad2) e (idad1 > idad3) entao
            escreva(nome1, " É O MAIS VELHO")
        senao se (idad2 > idad1) e (idad2 > idad3) entao
            escreva(nome2, " É O MAIS VELHO")
        senao se (idad3 > idad1) e (idad3 > idad2) entao
            escreva(nome3, " É O MAIS VELHO")
        fimse

        se (idad1 < idad2) e (idad1 < idad3) entao
            escreva(nome1, " É O MAIS NOVO")
        senao se (idad2 < idad1) e (idad2 < idad3) entao
            escreva(nome2, " É O MAIS NOVO")
        senao se (idad3 < idad1) e (idad3 < idad2) entao
            escreva(nome3, " É O MAIS NOVO")
        fimse
    fimse

    // Exibição da média das alturas
    se media >= 0 entao
        escreva("A altura média é: ", media)
    senao
        escreva("INVÁLIDO")
    fimse

   FIM


 */
package expag89n27;
import javax.swing.JOptionPane;
public class ExPag89N27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float alt1,alt2,alt3,idad1,idad2,idad3,media;
        
        String salt1,salt2,salt3,sidad1,sidad2,sidad3,nome1,nome2,nome3;
        salt1 = JOptionPane.showInputDialog(" Digite o valor da Altura do primeiro ");
        alt1 = Float.parseFloat(salt1);
        
        salt2 = JOptionPane.showInputDialog(" Digite o valor da altura do segundo  ");
        alt2 = Float.parseFloat(salt2);
        
        salt3 = JOptionPane.showInputDialog(" Digite o valor da altura do terceiro ");
        alt3 = Float.parseFloat(salt3);
        
        sidad1 = JOptionPane.showInputDialog(" Digite a idade do primeiro ");
        idad1 = Float.parseFloat(sidad1);
        
        sidad2 = JOptionPane.showInputDialog(" Digite o idade do segundo ");
        idad2 = Float.parseFloat(sidad2);
        
        sidad3 = JOptionPane.showInputDialog(" Digite o idade do terceiro ");
        idad3 = Float.parseFloat(sidad3);
        
        nome1 = JOptionPane.showInputDialog(" Digite o nome1 ");
        nome2 = JOptionPane.showInputDialog(" Digite o nome 2 ");
        nome3 = JOptionPane.showInputDialog(" Digite o nome 3 ");
       
        media = alt1 + alt2 + alt3/3;
        
        if((alt1>=0)&&(alt2>=0)&&(alt3>=0))
        {
        
        if((alt1>alt2)&&(alt1>alt3))
        {
            JOptionPane.showMessageDialog(null,nome1 + " É O MAIOR ");
        }
        else if ((alt2>alt1)&&(alt2>alt3))
        {
            JOptionPane.showMessageDialog(null,nome2 + " É O MAIOR ");
        }
        else if ((alt3>alt1)&&(alt3>alt2))
                {
                 JOptionPane.showMessageDialog(null,nome3 + " É O MAIOR ");
                }
        else {
              JOptionPane.showMessageDialog(null," INVÁLIDO ");
        }
         if((alt1>=0)&&(alt2>=0)&&(alt3>=0))
        {
        
        if((alt1<alt2)&&(alt1<alt3))
        {
            JOptionPane.showMessageDialog(null,nome1 + " É O MAIS BAIXO ");
        }
        else if ((alt2<alt1)&&(alt2<alt3))
        {
            JOptionPane.showMessageDialog(null,nome2 + " É O MAIS BAIXO ");
        }
        else if ((alt3<alt1)&&(alt3<alt2))
                {
                 JOptionPane.showMessageDialog(null,nome3 + " É O MAIS BAIXO ");
                }
        else {
              JOptionPane.showMessageDialog(null," INVÁLIDO ");
        }
        
        if((idad1>=0)&&(idad2>=0)&&(idad3>=0))
        {
            if((idad1>idad2)&&(idad1>idad3))
            {
                 JOptionPane.showMessageDialog(null,nome1 + " É O MAIS VELHO ");
            }
            else if ((idad2>idad1)&&(idad2>idad3))
            {
              JOptionPane.showMessageDialog(null,nome2 + " É O MAIS VELHO ");
            }
             else if ((idad3>idad1)&&(idad3>idad1))
             {
                  JOptionPane.showMessageDialog(null,nome3 + " É O MAIS VELHO ");
             }
            if((idad1>=0)&&(idad2>=0)&&(idad3>=0))
        {
            if((idad1<idad2)&&(idad1<idad3))
            {
                 JOptionPane.showMessageDialog(null,nome1 + " É O MAIS NOVO ");
            }
            else if ((idad2>idad1)&&(idad2>idad3))
            {
              JOptionPane.showMessageDialog(null,nome2 + " É O MAIS NOVO ");
            }
             else if ((idad3>idad1)&&(idad3>idad1))
             {
                  JOptionPane.showMessageDialog(null,nome3 + " É O MAIS NOVO ");
             }
            if(media>=0)
            {
            JOptionPane.showMessageDialog(null,"A altura média é : " + media);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"INVÁLIDO");
            }
        }
    }
        }
        }
    }
}
    
