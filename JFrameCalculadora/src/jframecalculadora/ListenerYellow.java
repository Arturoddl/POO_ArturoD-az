/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecalculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author Arturo Díaz de León
 */
public class ListenerYellow implements ActionListener{
    JTextField h = new JTextField();
    JButtonC aux = new JButtonC();
    
    public ListenerYellow(JTextField a) {
        this.h = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        aux = (JButtonC) ae.getSource();
        if("C".equals(aux.getText())){
            h.setText(null);
        }
        if("CE".equals(aux.getText())){
            h.setText(h.getText().substring(0, h.getText().length()-1));
        }
        if(".".equals(aux.getText())){
            int k=0;
            int i = h.getText().length();
            char auxx;
            for(int j=0; j<i; j++){
                auxx = h.getText().charAt(j);
                if(auxx == '.'){
                    k = 1;
                }
                if(auxx == 'x' || auxx == '/' || auxx == '+' || auxx == '-'){
                    k = 0;
                }
            }
            if(k==0){
                h.setText(h.getText() + aux.getText());
            }
        }
        if("?".equals(aux.getText())){
            h.setText(null);
            h.setText("Mesi chikito");
        }
    }
}
