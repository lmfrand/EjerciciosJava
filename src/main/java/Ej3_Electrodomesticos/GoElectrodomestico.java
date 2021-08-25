package Ej3_Electrodomesticos;

public class GoElectrodomestico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Television e=new Television(100, 20, 'C', "Blanco", 42, true);
        System.out.println("El precio final de la lavadora es de " +
                e.precioTelevisor(e)+ "€");
                //System.out.println(e.getPeso());
    }
    
}
