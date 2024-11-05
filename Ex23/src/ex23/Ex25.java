/*
 
 */
package ex23;
import javax.swing.JOptionPane;
public class Ex23 {

    
    public static void main(String[] args) {
        double volume,raio2,altura;
        
        String sraio2,saltura;
        
        sraio2 = JOptionPane.showInputDialog(null," Valor do raio ");
        raio2 = Double.parseDouble(sraio2);
        
        saltura = JOptionPane.showInputDialog(null," Valor da altura ");
        altura = Double.parseDouble(saltura);
        
        volume = (raio2*raio2)*altura*3.14;
        
        JOptionPane.showMessageDialog(null,"O volume da caixa D'Água é " + volume);
        
    }
    
}
