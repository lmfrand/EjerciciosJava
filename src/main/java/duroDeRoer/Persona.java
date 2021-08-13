package duroDeRoer;

/**
 *
 * @author LuisMiguel
 */
public class Persona {    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Constantes
    //Sexo por defecto
    private final static String SEXO_DEF = "H";
    
    //El peso de la persona esta por debajo del peso ideal
    public static final int INFRAPESO = -1; 
    
    //El peso de la persona esta en su peso ideal    
    public static final int PESO_IDEAL = 0;
    
    //El peso de la persona esta por encima del peso ideal    
    public static final int SOBREPESO = 1;
    
    private String nombre, sexo;
    private int edad, IMC;
    private String DNI;
    private double peso, pesoActual;
    private double altura;
    
    //Constructor por defecto
    public Persona(){
        
    }
    //Constructor con 6 parámetros   
    public Persona(String nom, int edad, String sexo, int peso, int altura){
        nombre=nom;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        generarDNI();
        this.sexo=sexo;
        comprobarSexo();
        
        
    }
    //Contructor con 3 parámetros
    public Persona(String nom, int edad, String sexo){
        nombre=nom;
        this.edad=edad;
        this.sexo=sexo;
    }
    
    public String esMayorDeEdad(int edad){
        if (edad>17){
            return " es mayor de edad."; 
        }
        return " no es mayor de edad.";
    }
    
    public void comprobarSexo(){
        if (sexo!="H" || sexo!="M"){
            sexo=SEXO_DEF;
        }
    }
    
    public String generarDNI(){
        double Id;
        int dniFin;
        String letraDni="";
        
        Id=Math.random()*100000000;
        dniFin=(int)Id;
        int caracter=(int)Math.floor(Math.random()*(122-97)+97);
        letraDni=letraDni + (char)caracter;
        DNI=dniFin+letraDni.toUpperCase();
        return DNI;
    }
    public double calcularIMC(double altura, double peso){
        this.peso=peso;
        this.altura=altura;
        pesoActual = peso/(Math.pow(altura, 2));
        if (pesoActual>=20 && pesoActual<=25){
            return PESO_IDEAL;
        } else if (pesoActual<20){
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }
    public void obtenerDatos(){
        
        System.out.println("Ficha completa de: " + getNombre());
        System.out.println("Nombre: " + getNombre() + "\nEdad:" + getEdad() + 
                "\nSexo: " + getSexo() + "\nPeso: " + getPeso() + 
                "\nAltura: " + getAltura());
        
    }
            
        

    
        
}
