package Ej3_Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private int carga;
    private final static int CARGA_DEF=5;
    private int precioFin;
    
    public Lavadora(){
        this(PRECIO_DEF, PESO_DEF, CONENE_DEF, COLOR_DEF, CARGA_DEF);
    }
    
    public Lavadora (int precio_base, int peso){
       this(precio_base, peso, CONENE_DEF, COLOR_DEF, CARGA_DEF);
       
    }
    
    public Lavadora (int precio_base, int peso, char consumo_energetico, String color, int carga){
       super(precio_base, peso, consumo_energetico, color);
       this.carga=carga;
    }
    
    public int getCarga(){
        return carga;
        
    } 
    
    public int precioLavadora(Electrodomestico e){
        
        if (carga<30){
            precioFin=e.precioFinal();
        } else {
            precioFin=e.precioFinal()+50;
        }
        return precioFin;
    }
}
