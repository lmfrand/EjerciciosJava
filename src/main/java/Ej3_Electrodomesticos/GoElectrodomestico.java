package Ej3_Electrodomesticos;

public class GoElectrodomestico {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double sumaLavadora=0, sumaTelevisor=0, sumaOtros=0;
        
        Electrodomestico[] elec=new Electrodomestico[10];
        elec[0]=new Electrodomestico(200, 60, 'C', "Verde");
        elec[1]=new Lavadora(150, 30);
        elec[2]=new Television(500, 80, 'E', "negro", 42, false);
        elec[3]=new Electrodomestico();
        elec[4]=new Electrodomestico(600, 20, 'D', "gris");
        elec[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        elec[6]=new Television(250, 70);
        elec[7]=new Lavadora(400, 100, 'A', "verde", 15);
        elec[8]=new Television(200, 60, 'C', "naranja", 30, true);
        elec[9]=new Electrodomestico(50, 10);
    
        for (int i=0; i<10; i++){
            if (elec[i] instanceof Lavadora){
                sumaLavadora+=elec[i].precioGenerico();          
            } else if (elec[i] instanceof Television){
                sumaTelevisor+=elec[i].precioGenerico();
            } else {
                sumaOtros+=elec[i].precioGenerico();
            }
            
        }
        System.out.println("Precio de las lavadoras " + sumaLavadora + "€");
        System.out.println("Precio de los televisores " + sumaTelevisor + "€");
        System.out.println("Precio de otros electrodomésticos " + sumaOtros + "€");
    
    }
}
