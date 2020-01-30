import java.io.*;

public class Main
{
	public static void main(String []args)
	{
		File file = new File("Lista.csv");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line;
		int lineNumber=0;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			
			if(line>0)
			{
				String []params=line.split(",");
				String nombre=params[0];
				int edad=Integer.parseInt(params[1]);
				Perro perro = new Perro(edad,nombre);
				
				System.out.println(Ivan.getNombre());
				System.out.println(
			}
		}
			
	}
	
	public static void main1(String []args)
	{
		Dueno Ivan=new Dueno(37, Genero.MASCULINO, "Ivan");
		Dueno Alan=new Dueno(24, Genero.MASCULINO, "Alan");
		Dueno Paty=new Dueno(28, Genero.FEMENINO, "Paty");
		Dueno Mirna=new Dueno(38, Genero.FEMENINO);	

		Perro Max=new Perro(1,Raza.BULL_DOG);
		Perro Firulais=new Perro(0,Raza.BULL_DOG);

		Ivan.setDueno(Max);
		Mirna.setDueno(Firulais);
		
		System.out.println(Ivan.getNombre());
		System.out.println(Max.getNombre());
	}

}