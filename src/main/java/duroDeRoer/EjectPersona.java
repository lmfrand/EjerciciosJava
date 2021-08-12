package duroDeRoer;

import javax.swing.JOptionPane;

/**
 *
 * @author LuisMiguel
 */
public class EjectPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1=new Persona();
        String suNombre, suSexo, suEdad, suPeso, suAltura;
        double pesoNum, alturaNum;
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
    }
    
}
