/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jframecalculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arturo Díaz de León
 */
public class JFrameCalculadora extends JFrame{
    public JFrameCalculadora(String titulo, int w, int h){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        //CREAR EL COMPONENTE PARA LA PARTE CENTRAL
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        //CREAMOS LOS BOTONES.
        Dimension dim = new Dimension(30,30);
        JButtonC btnC = new JButtonC("C", dim, Color.yellow);
        JButtonC btnCE = new JButtonC("CE", dim, Color.yellow);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.gray);
        JButtonC btnMulti = new JButtonC("x", dim, Color.gray);
        JButtonC btn7 = new JButtonC("7", dim, Color.green);
        JButtonC btn8 = new JButtonC("8", dim, Color.green);
        JButtonC btn9 = new JButtonC("9", dim, Color.green);
        JButtonC btnDiv = new JButtonC("/", dim, Color.gray);
        JButtonC btn4 = new JButtonC("4", dim, Color.green);
        JButtonC btn5 = new JButtonC("5", dim, Color.green);
        JButtonC btn6 = new JButtonC("6", dim, Color.green);
        JButtonC btnMenos = new JButtonC("-", dim, Color.gray);
        JButtonC btn1 = new JButtonC("1", dim, Color.green);
        JButtonC btn2 = new JButtonC("2", dim, Color.green);
        JButtonC btn3 = new JButtonC("3", dim, Color.green);
        JButtonC btnPlus = new JButtonC("+", dim, Color.gray);
        JButtonC btn0 = new JButtonC("0", dim, Color.green);
        JButtonC btnPnto = new JButtonC(".", dim, Color.yellow);
        JButtonC btnEquals = new JButtonC("=", dim, Color.gray);
        JButtonC btnInfo = new JButtonC("?", dim, Color.LIGHT_GRAY);
        
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btn0);
        panelCentral.add(btnPnto);
        panelCentral.add(btnEquals);
        panelCentral.add(btnInfo);
        
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 50);
        display.setFont(nueva);
        
        
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout. NORTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ListenerGreen grin = new ListenerGreen(display);
        ListenerYellow yelou = new ListenerYellow(display);
        ListenerGray grei = new ListenerGray(display);        
        btn1.addActionListener(grin);
        btn2.addActionListener(grin);
        btn3.addActionListener(grin);
        btn4.addActionListener(grin);
        btn5.addActionListener(grin);
        btn6.addActionListener(grin);
        btn7.addActionListener(grin);
        btn8.addActionListener(grin);
        btn9.addActionListener(grin);
        btn0.addActionListener(grin);
        btnMM.addActionListener(grin);
        
        btnC.addActionListener(yelou);
        btnCE.addActionListener(yelou);
        btnInfo.addActionListener(yelou);
        btnPnto.addActionListener(yelou);
        
        btnEquals.addActionListener(grei);
        btnDiv.addActionListener(grei);
        btnMulti.addActionListener(grei);
        btnPlus.addActionListener(grei);
        btnMenos.addActionListener(grei);
        
    }

   public static void main(String[] args) {
       JFrameCalculadora calcu = new JFrameCalculadora("Messi chikito", 500, 700);
       calcu.setVisible(true);
       calcu.setSize(430, 400);
    }
}
