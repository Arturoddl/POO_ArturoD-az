/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclao;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/**
 *
 * @author Arturo Díaz de León
 */
public abstract class ListenerGrays implements KeyListener{

            @Override
            public void keyTyped(KeyEvent e) {
                JButtonTc aux = (JButtonTc) e.getSource();
                System.out.println("KeyTyped "+ e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                JButtonTc aux = (JButtonTc) e.getSource();
                System.out.println("KeyPressed "+ e.getKeyChar());
  
            }

            @Override
            public void keyReleased(KeyEvent e) {
                JButtonTc aux = (JButtonTc) e.getSource();
                System.out.println("KeyReleased "+ e.getKeyChar());
            }

}