/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Color;
import javax.swing.JFrame;


/**
 *
 * @author Arturo Díaz de León
 */
public class Gui {
    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        NewJFrame aux = new NewJFrame("New Windooow", 400, 600);
     // NewJFrame aux2 = new NewJFrame("New Window", 100, 200);
     // NewJFrame aux3 = new NewJFrame("Nueva Ventanota", 800, 300);
        aux.setVisible(true);
        aux.setLocationRelativeTo(null);
        aux.setForeground(Color.black);
        aux.setBackground(Color.yellow);
        
    }
    
}
