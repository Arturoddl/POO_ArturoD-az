/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaaa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo Díaz de León
 */
p//ublic class ListenerBlues implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonX aux = (JButtonX) e.getSource();
        if("Defecto".equals(aux.getText())){
            JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo por defecto.", "Defecto", JOptionPane.DEFAULT_OPTION);
        }
        if("Información".equals(aux.getText())){
            JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de información.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        if("Advertencia".equals(aux.getText())){
        //    JOptionPane.showMessageDialog(aux, "Cuidao.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        if("Error".equals(aux.getText())){
            JOptionPane.showMessageDialog(aux, "Este es un cuadro de error.", "Error 404", JOptionPane.ERROR_MESSAGE);
        }
        if("Pregunta".equals(aux.getText())){
            JOptionPane.showMessageDialog(aux, "¿Acaso este es un cuadro de pregunta?", "¿?", JOptionPane.QUESTION_MESSAGE);
        }
        if("Naik".equals(aux.getText())){
            JOptionPane.showMessageDialog(aux, "", "", JOptionPane.PLAIN_MESSAGE);
        }
}

}