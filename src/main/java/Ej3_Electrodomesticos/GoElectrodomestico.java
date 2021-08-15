package Ej3_Electrodomesticos;

public class GoElectrodomestico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Lavadora e=new Lavadora(54, 20);
        System.out.println("El precio final de la lavadora es de " +
                e.precioFinal() + "€");
    }
    
}
