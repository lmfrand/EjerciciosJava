package Ej3_Electrodomesticos;

public class Electrodomestico {
    
    protected int precio_base, peso;
    protected String color;
    protected char consumo_energetico;
    
    protected final static String COLOR_DEF="Blanco";
    protected final static char CONENE_DEF='F';
    protected final static int PRECIO_DEF=100;
    protected final static int PESO_DEF=5;
    
    //Constructor por defecto
    public Electrodomestico(){
        this(PRECIO_DEF, PESO_DEF, CONENE_DEF, COLOR_DEF);
    } 
    
    //Constructor con dos parámetros
    public Electrodomestico(int precio_base, int peso){
        this(precio_base, peso, CONENE_DEF, COLOR_DEF);
        
    }
    
    //Constructor con todos los parámetros
    public Electrodomestico (int precio_base, int peso, char consumo_energetico, String color){
        this.precio_base=precio_base;
        this.color=color;
        this.consumo_energetico=consumo_energetico;
        this.peso=peso;
    }
    
    //GETTERS
    public int getPrecio_base() {
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
    public void setPrecio_base(int precio_base) {
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
    
}
