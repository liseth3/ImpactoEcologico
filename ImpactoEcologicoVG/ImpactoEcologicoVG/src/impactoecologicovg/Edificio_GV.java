/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologicovg;

import javax.swing.JOptionPane;

/**
 *
 * @author Vilela_Genesis
 */
public class Edificio_GV extends MetodoEcologico_GV {
           
     private int numeroPisos;
    private boolean tieneEnergiaRenovable;

    public Edificio_GV(int numeroPisos, boolean tieneEnergiaRenovable) {
        this.numeroPisos = numeroPisos;
        this.tieneEnergiaRenovable = tieneEnergiaRenovable;
    }

    public void obtenerImpactoEcologico() {
        JOptionPane.showMessageDialog(null,"Identificación: Edificio "+"\n"
                +"Número de pisos: " + numeroPisos+"\n"
                +"Energía renovable: " + (tieneEnergiaRenovable ? "Sí" : "No"));

        if (!tieneEnergiaRenovable) {
            // Realiza el cálculo específico para edificios sin energía renovable
            int impactoEco = numeroPisos * 100; // Ejemplo de cálculo
            
            JOptionPane.showMessageDialog(null,"->El edificio no utiliza energía renovable, se debe considerar su impacto ecológico.<-\n"
                    + "Impacto ecológico del edificio: " + impactoEco+"\n");
            
        } else {
            // Realiza el cálculo específico para edificios con energía renovable
            int impactoEco = numeroPisos * 50; // Ejemplo de cálculo
            JOptionPane.showMessageDialog(null,"->El edificio utiliza energía renovable y contribuye menos al impacto ecológico.<-\n"
                    + "Impacto ecológico del edificio: " + impactoEco+"\n");
        }
    }
}
