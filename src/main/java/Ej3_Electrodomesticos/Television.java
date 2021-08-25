package Ej3_Electrodomesticos;

public class Television extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizador;
    
    private final static int RESOLUCION_DEF=20;
    private final static boolean SINTONIZADOR_DEF=false;
    private double precioFin;
    
    //Constructor por defecto
    public Television (){
        this(PRECIO_DEF, PESO_DEF, CONENE_DEF, COLOR_DEF, RESOLUCION_DEF, SINTONIZADOR_DEF);
    }
    
    //Constructor con dos parametros
    public Television(double precio_base, int peso){
        this(precio_base, peso, CONENE_DEF, COLOR_DEF, RESOLUCION_DEF, SINTONIZADOR_DEF);
    }
    
    //Constructor con todos los parámetros
    public Television (double precio_base, int peso, char consumo_energetico, String color, int resolucion, boolean sintonizador){
        super(precio_base, peso, consumo_energetico, color);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
        
        
    }
    
    public int getResolucion(){
        return resolucion;   
    }
    
    public boolean getSintonizador(){
        return sintonizador;
    }
    
    public double precioTelevisor(Electrodomestico e){
        
        if (resolucion>=40 && sintonizador==true){
            precioFin=(e.precioGenerico()*0.3)+e.precioGenerico()+50;
        } else if (resolucion>40 && sintonizador==false){
            precioFin=e.precioGenerico()*30+e.precioGenerico();
        } else if (resolucion<40 && sintonizador==true){
            precioFin=e.precioGenerico()+50;
        } else {
            precioFin=e.precioGenerico();
        }
        
        return precioFin;
    }
    
    
    
}
