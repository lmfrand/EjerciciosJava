package Ej3_Electrodomesticos;

public class GoElectrodomestico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Lavadora e=new Lavadora(100, 20, 'C', "Blanco", 34);
        System.out.println("El precio final de la lavadora es de " +
                e.precioLavadora(e)+ "€");
                //System.out.println(e.getPeso());
    }
    
}
