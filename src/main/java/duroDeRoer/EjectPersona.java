package duroDeRoer;

import javax.swing.JOptionPane;
import java.lang.*;

/**
 *
 * @author LuisMiguel
 */
public class EjectPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1=new Persona();
        Persona persona2=new Persona();
        Persona persona3=new Persona();
        
        String suNombre, suEdad, suSexo, suPeso, suAltura;
        double pesoNum, alturaNum;
        char sex;
        int edadNum;
            
        suNombre=JOptionPane.showInputDialog("Introduzca su nombre: ");
        edadNum=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
        suSexo=JOptionPane.showInputDialog("Introduzca su sexo: ");
        pesoNum=Double.parseDouble(JOptionPane.showInputDialog("Introduzca su peso: "));
        alturaNum=Double.parseDouble(JOptionPane.showInputDialog("Introduzca su altura: "));
        
        persona1.setNombre(suNombre);
        persona1.setEdad(edadNum);
        persona1.setSexo(suSexo);
        persona1.setPeso(pesoNum);
        persona1.setAltura(alturaNum);
        
        System.out.println("La primera persona, que se llama "+ suNombre +
                ", con DNI nº:" + persona1.generarDNI() + persona1.esMayorDeEdad(edadNum));
        if (persona1.calcularIMC(alturaNum, pesoNum)==0){
            System.out.println(suNombre + " está en su peso ideal.");
        } else if (persona1.calcularIMC(alturaNum, pesoNum)==-1){
            System.out.println(suNombre + " está por debajo de su peso ideal.");
        } else {
            System.out.println(suNombre + " está por encima de su peso ideal.");
        }
        persona1.obtenerDatos();
        
        
        //suNombre=JOptionPane.showInputDialog("Introduzca su nombre: ");
        //edadNum=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su edad: "));
        //suSexo=JOptionPane.showInputDialog("Introduzca su sexo: ");
        
        //persona2.getNombre(suNombre);
        //persona2.setEdad(edadNum);
        //persona2.setSexo(sex);
        
    }
    
}
