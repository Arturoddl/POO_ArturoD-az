/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Teclao.JButtonTc;
import Teclao.ListenerGrays;
import java.awt.event.KeyEvent;

/**
 *
 * @author Arturo Díaz de León
 */

public class Teclaooo extends JFrame{
    
    public Teclaooo(){
        inicializarComponentes();
        
    }
    
    public void inicializarComponentes(){
        JPanel keyb = new JPanel(new GridLayout(4, 11));
        Dimension dim = new Dimension(10,10);
        
        JButtonTc b1 = new JButtonTc("1", dim, Color.GRAY);
        JButtonTc b2 = new JButtonTc("2", dim, Color.GRAY);
        JButtonTc b3 = new JButtonTc("3", dim, Color.GRAY);
        JButtonTc b4 = new JButtonTc("4", dim, Color.GRAY);
        JButtonTc b5 = new JButtonTc("5", dim, Color.GRAY);
        JButtonTc b6 = new JButtonTc("6", dim, Color.GRAY);
        JButtonTc b7 = new JButtonTc("7", dim, Color.GRAY);
        JButtonTc b8 = new JButtonTc("8", dim, Color.GRAY);
        JButtonTc b9 = new JButtonTc("9", dim, Color.GRAY);
        JButtonTc b0 = new JButtonTc("0", dim, Color.GRAY);
        JButtonTc delete = new JButtonTc("<--", dim, Color.GRAY);
        JButtonTc q = new JButtonTc("Q", dim, Color.GRAY);
        JButtonTc w = new JButtonTc("W", dim, Color.GRAY);
        JButtonTc e = new JButtonTc("E", dim, Color.GRAY);
        JButtonTc r = new JButtonTc("R", dim, Color.GRAY);
        JButtonTc t = new JButtonTc("T", dim, Color.GRAY);
        JButtonTc y = new JButtonTc("Y", dim, Color.GRAY);
        JButtonTc u = new JButtonTc("U", dim, Color.GRAY);
        JButtonTc i = new JButtonTc("I", dim, Color.GRAY);
        JButtonTc o = new JButtonTc("O", dim, Color.GRAY);
        JButtonTc p = new JButtonTc("P", dim, Color.GRAY);
        JButtonTc naik = new JButtonTc("", dim, Color.GRAY);
        JButtonTc a = new JButtonTc("A", dim, Color.GRAY);
        JButtonTc s = new JButtonTc("S", dim, Color.GRAY);
        JButtonTc d = new JButtonTc("D", dim, Color.GRAY);
        JButtonTc f = new JButtonTc("F", dim, Color.GRAY);
        JButtonTc g = new JButtonTc("G", dim, Color.GRAY);
        JButtonTc h = new JButtonTc("H", dim, Color.GRAY);
        JButtonTc j = new JButtonTc("J", dim, Color.GRAY);
        JButtonTc k = new JButtonTc("K", dim, Color.GRAY);
        JButtonTc l = new JButtonTc("L", dim, Color.GRAY);
        JButtonTc up = new JButtonTc("^", dim, Color.GRAY);
        JButtonTc naik2 = new JButtonTc("", dim, Color.GRAY);
        JButtonTc z = new JButtonTc("Z", dim, Color.GRAY);
        JButtonTc x = new JButtonTc("X", dim, Color.GRAY);
        JButtonTc c = new JButtonTc("C", dim, Color.GRAY);
        JButtonTc v = new JButtonTc("V", dim, Color.GRAY);
        JButtonTc b = new JButtonTc("B", dim, Color.GRAY);
        JButtonTc n = new JButtonTc("N", dim, Color.GRAY);
        JButtonTc m = new JButtonTc("M", dim, Color.GRAY);
        JButtonTc ñ = new JButtonTc("Ñ", dim, Color.GRAY);
        JButtonTc left = new JButtonTc("<", dim, Color.GRAY);
        JButtonTc down = new JButtonTc("v", dim, Color.GRAY);
        JButtonTc right = new JButtonTc(">", dim, Color.GRAY);
        
        keyb.add(b1);
        keyb.add(b2);
        keyb.add(b3);
        keyb.add(b4);
        keyb.add(b5);
        keyb.add(b6);
        keyb.add(b7);
        keyb.add(b8);
        keyb.add(b9);
        keyb.add(b0);
        keyb.add(delete);
        keyb.add(q);
        keyb.add(w);
        keyb.add(e);
        keyb.add(r);
        keyb.add(t);
        keyb.add(y);
        keyb.add(u);
        keyb.add(i);
        keyb.add(o);
        keyb.add(p);
        keyb.add(naik);
        keyb.add(a);
        keyb.add(s);
        keyb.add(d);
        keyb.add(f);
        keyb.add(g);
        keyb.add(h);
        keyb.add(j);
        keyb.add(k);
        keyb.add(l);
        keyb.add(up);
        keyb.add(naik2);
        keyb.add(z);
        keyb.add(x);
        keyb.add(c);
        keyb.add(v);
        keyb.add(b);
        keyb.add(n);
        keyb.add(m);
        keyb.add(ñ);
        keyb.add(left);
        keyb.add(down);
        keyb.add(right);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        add(keyb, BorderLayout.CENTER);
         
        /*
        ListenerGrays elorejon = new ListenerGrays(){
        q.addKeyListener(elorejon);
        w.addKeyListener(elorejon);
        e.addKeyListener(elorejon);
        r.addKeyListener(elorejon);
        t.addKeyListener(elorejon);
        y.addKeyListener(elorejon);    
}
*/
    }
    
}