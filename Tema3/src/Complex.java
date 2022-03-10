
public class Complex {
	private double a;
	private double b;
	private static  int contor=0;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
		contor++;
	}
	//returneaza un numar de tip double 
	//o functie este o bucata de cod cu un nume
	//nivel de acces
	public double Clob()
	// functia void nu returneaza nimic
	{
		//returneaza modulul
		double modul = Math.sqrt((a*a+b*b));
		return modul;
	}
	
	public void Display()
	{
		System.out.println(a+" + i"+b);
	}
	
	//parametru de tip complex
	public Complex Suma(Complex z)
	{
		Complex S = new Complex(z.a, z.b) ;
		S.a = S.a + a;
		S.b = S.b + b;
				//Z=z1+z2
		return S;
	}
	
	public int Numarare()
	{
		return contor;
	}

	
}
