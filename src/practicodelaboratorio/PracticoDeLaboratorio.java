package practicodelaboratorio;
/*
 * 
 * Alumno: Lorenzo, Juan Martin
 *         MU: 1143
 * 
 * 
 */


import GUI.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PracticoDeLaboratorio {

    public static void main(String[] args){
        try {
           VPrincipal v = new VPrincipal();
           v.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
