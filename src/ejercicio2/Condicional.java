package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {
    
    

    public void calcular() {
        int acS=0;
        double acP=1;
        
        for (int i = 10; i < 90; i++) {
            acS = i + acS; 
            acP = i * acP;
        }
        JOptionPane.showMessageDialog(null,"Suma= "+acS);
        JOptionPane.showMessageDialog(null,"Producto= "+acP);        
    }
}
