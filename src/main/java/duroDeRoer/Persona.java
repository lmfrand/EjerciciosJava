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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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
    
    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;
    
    public Persona(){
        
    }
       
    public Persona(String nom, int edad, int DNI, String sexo, int peso, int altura){
        nombre=nom;
        this.edad=edad;
        this.DNI=DNI;
        this.sexo=sexo;
        this.peso=peso;
        this.altura=altura;
    }
    
    public Persona(String nom, int edad, String sexo){
        nombre=nom;
        this.edad=edad;
        this.sexo=sexo;
    }
    
    public boolean esMayorDeEdad(int edad){
        if (edad>17){
        return true; 
        }
        return false;
    }
    
   /* public double calcularIMC(double altura, double peso){
        this.peso=peso;
        this.altura=altura;
        if (peso/altura^2==)
            
        
    }*/
    
        
}
