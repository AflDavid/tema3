
public class ClientComplex {

	public static void main (String[] args) {
		
		Complex z1 = new Complex(2,2);
		Complex z2 = new Complex(3,3);
		
		z1.Display();
		double modul = z1.Clob();
		System.out.println(modul);
		
		int contor = z1.Numarare();
		System.out.println(contor);
		
		Complex z3 = z1.Suma(z2);
		
		z3.Display();
		z1.Numarare();
	}
}
