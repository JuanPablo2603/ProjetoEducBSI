
package ex24;
import javax.swing.JOptionPane;
public class Ex24 {

    
    public static void main(String[] args) {
       float primeiro,segundo,terceiro,totalprimeiro,totalsegundo,totalterceiro,proporção,divisao;
        String sprimeiro,ssegundo,sterceiro;
        
        sprimeiro =  JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        primeiro = Float.parseFloat(sprimeiro);
        
        ssegundo = JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        segundo = Float.parseFloat(ssegundo);
        
        sterceiro = JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        terceiro =Float.parseFloat(sterceiro);
        
        proporção = primeiro + segundo + terceiro;
        divisao = (50*10000)/proporção;
        totalprimeiro = divisao*primeiro;
        totalsegundo = divisao*segundo;
        totalterceiro = divisao*terceiro;
        
        JOptionPane.showMessageDialog(null," A divisão do primeiro é " + totalprimeiro + " a divisão do segundo é " + totalsegundo + " a divisao do terceiro é " + totalterceiro  );
       
        
    }
    
}
