package javaSusret6;

public class Funkcije1 {

	public static void main(String[] args) { //f-ju definise broj i ime i tip argumenta
		// TODO Auto-generated method stub
		
		System.out.println("Trenutno sam u main metodi.");	
		ispisiNesto();
		ispisiNesto("Dejan"); // parametar
		ispisiNesto(33);
		ispisiNesto("Janko", 28);
		ispisiNesto("Marko", "Markovic", 33);
		
	}
	
	
	public static void ispisiNesto()//zaglavlje funkcije
		{
		System.out.println("Ispisujem iz funkcije (bez argumenta)");//telo funkcije
	}
	
	
	public static void ispisiNesto(String argument1)//zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije (sa string argumentom): " + argument1);//telo funkcije
	}
	
	public static void ispisiNesto(int argument1)//zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije (sa int argumentom): " + argument1);//telo funkcije
	}
	
	public static void ispisiNesto(String argument1, int argument2)//zaglavlje funkcije
	{
		System.out.println("Ispisujem iz funkcije (sa dva različita argumenta): prvi argument " + argument1 + ", drugi argument " + argument2);//telo funkcije
	}
	
	
	public static void ispisiNesto(String ime, String prezime, int godine)//
	{
		System.out.println(ime + " " + prezime + ", " + godine + " godine.");//
	}
	
}
