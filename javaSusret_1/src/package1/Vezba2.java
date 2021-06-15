package package1;

public class Vezba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Napisati program koji racuna povrsinu kvadrata stranice a,
i povrsinu kruga poluprecnika r.
Povrsina kvadrata se racuna kao P = a x a
Povrsina kruga se racuna kao P = r x r x 3.14*/
		
		
		int a = 5;
		int P = a * a;
		
		System.out.println("Površina P kvadrata stranice " + a + " je: " + P);
		
		
		int r = 2;
		double krugP = (double) r * r * 3.14;
		
		System.out.println("Površina P kruga poluprecnika " + r +  " je: " + krugP); 
		
	}

}
