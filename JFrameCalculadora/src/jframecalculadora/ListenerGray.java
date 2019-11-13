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
public class ListenerGray implements ActionListener {
    JTextField h = new JTextField();
    JButtonC aux = new JButtonC();
    Operacion calc = new Operacion();
    char auxilio;
    
    public ListenerGray(JTextField a) {
        this.h = a;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        aux = (JButtonC) ae.getSource();
        
        if("=".equals(aux.getText())){
            int i,j,k;
            i = h.getText().length();
            
            String a = null, b = null, r, p= null;
            
            char c,d,eo;
            
            for(j=0; j<i; j++){
                c = h.getText().charAt(j);
                if(c == 'x' || c == '/' || c == '-' || c == '+' ){
                    calc.setOperando1(Double.parseDouble(a));
                    j=i;
                }
                else{
                    if(a==null){
                        a = String.valueOf(c);
                    }
                    else{
                        a = (a + c);
                    }
                }
            }
            
            for(k=i-1; k>=0; k--){
                d = h.getText().charAt(k);
                if(d == 'x' || d == '/' || d == '-' || d == '+' ){
                    calc.setOperando2(Double.parseDouble(b));
                    k=0;
                }
                else{
                    if(b == null){
                        b = String.valueOf(d);
                    }
                    else{
                        b = (d + b);
                    }
                }
            }
            
            for(j=0; j<i; j++){
               
                eo = h.getText().charAt(j);
                
                if(eo == 'x'){
                    r = String.valueOf(calc.multi());
                    
                    h.setText(r);
                    j=i;
                }
                if(eo == '/'){
                    r = String.valueOf(calc.div());
                    
                    if(calc.getOperando2() == 0){
                        h.setText("Math ERROR");
                    }
                    else{
                        h.setText(r);
                    }
                    j=i;
                }
                if(eo == '-'){
                    r = String.valueOf(calc.resta());
                    
                    h.setText(r);
                    j=i;
                }
                if(eo == '+'){
                    r = String.valueOf(calc.suma());
                    
                    h.setText(r);
                    j=i;
                }
            }
        }
        else{
            int k=0;
            int i= h.getText().length();
            char auxx;
            for(int j=0; j<i; j++)
            {
                auxx = h.getText().charAt(j);
                if(auxx == 'x' || auxx == '/' || auxx == '+' || auxx == '-'){
                    k = 1;
                }
            }
                if(k==0){
                h.setText(h.getText() + aux.getText());
            }
        }
    }
}
