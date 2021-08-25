package Ej3_Electrodomesticos;

public class Electrodomestico {
    
    protected double precio_base;
    protected int peso;
    protected String color;
    protected char consumo_energetico;
    
    protected final static String COLOR_DEF="Blanco";
    protected final static char CONENE_DEF='F';
    protected final static double PRECIO_DEF=100;
    protected final static int PESO_DEF=5;
    
    //Constructor por defecto
    public Electrodomestico(){
        this(PRECIO_DEF, PESO_DEF, CONENE_DEF, COLOR_DEF);
    } 
    
    //Constructor con dos parámetros
    public Electrodomestico(double precio_base, int peso){
        this(precio_base, peso, CONENE_DEF, COLOR_DEF);
        
    }
    
    //Constructor con todos los parámetros
    public Electrodomestico (double precio_base, int peso, char consumo_energetico, String color){
        this.precio_base=precio_base;
        this.color=color;
        this.consumo_energetico=consumo_energetico;
        this.peso=peso;
    }
    
    //GETTERS
    public double getPrecio_base() {
        return precio_base;
    }
    public int getPeso() {
        return peso;
    }
        public String getColor() {
        return color;
    }
        public char getConsumo_energetico() {
        return consumo_energetico;
    }
    
    //SETTERS
    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
      public void setPeso(int peso) {
        this.peso = peso;
    }
       public void setColor(String color) {
        this.color = color;
    }
      public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    } 
    
    public double precioGenerico(){
        
        double precio_final, precioEne;
        
        switch (consumo_energetico){
            case 'A':
                precioEne=precio_base+100;
                break;
            case 'B':
                precioEne=precio_base+80;
                break;
            case 'C':
                precioEne=precio_base+60;
                break;
            case 'D':
                precioEne=precio_base+50;
                break;
            case 'E':
                precioEne=precio_base+30;
                break;
            default:
                precioEne=precio_base+10;                 
        }
                
        if (peso>0 && peso<20){
            precio_final=precioEne+10;
        } else if (peso>19 && peso<50){
            precio_final=precioEne+50;
        } else if (peso>49 && peso<80){
            precio_final=precioEne+80;
        } else {
            precio_final=precioEne+100;
        }
        
        return precio_final;
    }
}
