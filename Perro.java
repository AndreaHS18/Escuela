
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro
{
    private int edad;
    private Raza raza;
    private String nombre;
    private String nombreDueno;
    
    /**
     * Constructor for objects of class Perro
     */
    public Perro(int edad,Raza raza)
    {
        this.edad=edad;
        this.raza=raza;
    }
    
    public void cumpleaños()
    {
        edad+=1;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setDueno(String Dueno)
    {
        nombreDueno=Dueno;
    }
    
    public String getNombre()
    {
        return nombre;
    }
}
