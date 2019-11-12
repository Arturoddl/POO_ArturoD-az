/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaaa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Arturo Díaz de León
 */
public class Practicaaa extends JFrame{

    public static void main(String[] args) {
        Practicaaa ex = new Practicaaa();
        ex.setVisible(true);
        ex.setSize(200, 500);
    }
    
    public Practicaaa(){
        inicializarComponentes();
        
    }
    
    public void inicializarComponentes(){
        JPanel botones = new JPanel(new GridLayout(6, 1));
        Dimension dim = new Dimension(10,10);
        
        JButtonX def = new JButtonX("Defecto", dim, Color.BLUE);
        JButtonX info = new JButtonX("Información", dim, Color.BLUE);
        JButtonX war = new JButtonX("Advertencia", dim, Color.BLUE);
        JButtonX error = new JButtonX("Error", dim, Color.BLUE);
        JButtonX preg = new JButtonX("Pregunta", dim, Color.BLUE);
        JButtonX naik = new JButtonX("Naik", dim, Color.BLUE);
        
        
        botones.add(def);
        botones.add(info);
        botones.add(war);
        botones.add(error);
        botones.add(preg);
        botones.add(naik);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        add(botones, BorderLayout.CENTER);
        
        ListenerBlues elorejas = new ListenerBlues();
        def.addActionListener(elorejas);
        info.addActionListener(elorejas);
        war.addActionListener(elorejas);
        error.addActionListener(elorejas);
        preg.addActionListener(elorejas);
        naik.addActionListener(elorejas);
    }
}
