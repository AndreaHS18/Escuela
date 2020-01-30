
/**
 * Write a description of class Dueno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dueno
{
    private int edad;
    private Genero genero;
    private Perro perro;
    private String nombre;
    private String apellido;

    /**
     * Constructor for objects of class Dueno
     */
    public Dueno(int edad,Genero genero)
    {
        this.edad=edad;
        this.genero=genero;
    }
    
    public Dueno(int edad,Genero genero,String nombre)
    {
        this.edad=edad;
        this.genero=genero;
        this.nombre=nombre;
    }
    
    public void cumpleanos()
    {
        edad+=1;
    }
    
    public void setDueno(Perro perro)
    {
        this.perro=perro;
		perro.setNombre("Snoopy");
		perro.setDueno(nombre);
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
	
	public String getNombre()
	{
		return nombre;
	}
    
    public void setNombre(String nombre,String apellido)
    {
        this.nombre=nombre+" "+apellido;
    }
    
}