/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex30;

import javax.swing.JOptionPane;
public class Ex30 {

    
    public static void main(String[] args) {
        // VAR
        int temp;
        String funcionario, s_temp;
               
        
        JOptionPane.showInputDialog(null, "ESCOLHA A SUA CATEGORIA: \nG - Projeto Grande \nM - Projeto Médio \nP - Projeto Pequeno");
        
        funcionario = JOptionPane.showInputDialog("Diga o nome do funcionário ");
        s_temp = JOptionPane.showInputDialog("Diga o tempo de empresa ");
        temp = Integer.parseInt(s_temp);
        temp = temp * 2;
       
         
        
        if(funcionario.equals("G"))
        {
            if(temp > 0)
            {
                JOptionPane.showMessageDialog(null, "a sua pontuação FOI DE  " + (temp +10));
            }
            else
            {
                JOptionPane.showMessageDialog(null, " inválido " );
            }
             if (funcionario.equals("M"))
             {
                 if(temp>0)
             
                    {
JOptionPane.showMessageDialog(null, "a sua pontuação FOI DE  " + (temp +5));               }
             else
             {
                  JOptionPane.showMessageDialog(null, " inválido");
             }
             if (funcionario.equals("P"))
                    {
                        if(temp>0)
                                {
                    
                     JOptionPane.showMessageDialog(null, "a sua pontuação FOI DE  " + (temp +2));
                                }
             else
             {
                  JOptionPane.showMessageDialog(null, " inválido ");
             
        }
    }
    }
        }
    }
}
