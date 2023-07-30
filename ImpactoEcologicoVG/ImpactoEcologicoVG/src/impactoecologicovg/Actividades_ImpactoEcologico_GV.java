/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impactoecologicovg;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *s
 * @author Vilela_Genesis
 */
public class Actividades_ImpactoEcologico_GV {
   
             public static void main(String[] args) {
        
    
         ArrayList<MetodoEcologico_GV> sc = new ArrayList<>();

      
       int Numero_piso=0;
       String booleanEnergia_R="";
       boolean Energia_R=true;
       String modelo="";
       int emisiones=0; 
       String tipo="";
       String variable="";
       boolean electrica=true;
       
        int selector=0;
        do{
         
            selector = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Menu de opciones\n\n"
                           +"1.Calcular impacto ecologico de un EDIFICIO\n"
                           +"2.Calcular impacto ecologico de un AUTO\n"
                           +"3.Calcular impacto ecologico de una BICICLETA\n"
                           +"4.Obtener impacto ecologico\n"          
                           +"5.Terminar\n\n"));

            switch (selector) {
                case 1:
                    
                    Numero_piso =Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero de pisos del edificio"));
                    
                    booleanEnergia_R =JOptionPane.showInputDialog(null,"Emplea energia renovable?");
                    
                    if (booleanEnergia_R.equals("SI")) {
                        Energia_R=true;
                        Edificio_GV edificio = new Edificio_GV(Numero_piso, Energia_R);
                        sc.add(edificio);
                    } else  { 
                        if (booleanEnergia_R.equals("NO")) {
                        Energia_R=false;
                        Edificio_GV edificio = new Edificio_GV(Numero_piso, Energia_R);
                        sc.add(edificio);
                        } else {
                            JOptionPane.showInputDialog(null, "Dato ha sido incorrecto");
                            break;
                        }
                    } 
                      
                    break;
                case 2:
                    modelo =JOptionPane.showInputDialog(null,"Digite el Modelo del Auto");
                    
                    emisiones =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad prevista de emiciones de carbodo por kilometro de su auto"));
                    
                    Auto_GV auto = new Auto_GV(modelo, emisiones);
                    sc.add(auto);
                    
                    break;
                case 3:
                    tipo =JOptionPane.showInputDialog(null,"Digite el tipo de bicibleta empleada, ejem: Montaña");
                    
                   variable =JOptionPane.showInputDialog(null,"Emplea energia renovable?");
                    
                    if (variable.equals("SI")) {
                        electrica=true;
                        Bicibleta_GV bicicleta = new Bicibleta_GV(tipo, electrica);
                        sc.add(bicicleta);
                    } else  { 
                        if (variable.equals("NO")) {
                        electrica=false;
                        Bicibleta_GV bicicleta = new Bicibleta_GV(tipo, electrica);
                        sc.add(bicicleta);
                        } else {
                            JOptionPane.showInputDialog(null, "Dato ha sido incorrecto");
                            break;
                        }
                    } 
                    
                    break; 
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "A continuacion se muestra el impacto generado\n"
                           +"al ambiente de los siguientes objetos:");
                    
                    for (MetodoEcologico_GV objeto : sc) {
                        objeto.obtenerImpactoEcologico();
                    }
                    break;    
                case 5:
                    selector=5;
                    JOptionPane.showMessageDialog(null,"Fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error al digitar");
                    break;
            }
        } while (selector!=5); 
    }
    
}
