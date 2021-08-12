package duroDeRoer;

import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author LuisMiguel
 */
public class goCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo;
        int repeticion;
       
        int eleccion=JOptionPane.showConfirmDialog(null, "Bienvenido al cajero automático. ¿Desea utilizar nuestro servicio?");
        
        if (eleccion==0){

            do {
                String nombre_usuario=JOptionPane.showInputDialog("Introduzca nombre del titular: ");   
                saldo=Double.parseDouble(JOptionPane.showInputDialog("Introduzca cantidad: "));

                Cuenta miSaldo=new Cuenta(nombre_usuario, saldo);
                JOptionPane.showMessageDialog(null, miSaldo.getCantidad());
                repeticion=JOptionPane.showConfirmDialog(null, "¿Desea hacer otra operación?");
                }
            while(repeticion==0);
        }
        
        JOptionPane.showMessageDialog(null, "¡Qué tenga un buen día!");
        
        //System.out.println(miSaldo.getTitular());
        
        
                
        /*
        miSaldo.Ingresar(22.0);
        System.out.println(miSaldo.getCantidad());
        miSaldo.Retirar(15.3);
        System.out.println(miSaldo.getCantidad());
        miSaldo.Retirar(35.2);
        */
        
        
    }
    
}
