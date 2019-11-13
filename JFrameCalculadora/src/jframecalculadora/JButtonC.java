/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecalculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Arturo Díaz de León
 */
public class JButtonC extends JButton{
    public JButtonC(){
        
    }
    public JButtonC(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
        setSize(dim);
        //TODO: TAMAÑO DEL BOTÓN.
        //COMPARTAN LA MISMA DIMENSIÓN.
        //TODO: CAMBIAR EL TAMAÑO DE LA ETIQUETA.
        
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo, 50);
        setFont (aux2);
        //TODO: CAMBIAR COLOR.
        setBackground(color);
        //TODO: VER LA FORMA EN QUE SE DISTRIBUYEN LOS COMPONENTES DENTRO DEL JFRAME.
        
    }

}
