package zadatak2;

public class StudentMaster extends Student{
	
	
	
	private int ocenaMastera;

	public StudentMaster(String imeIPrezime, long jMBG, String brIndexa, int ocenaMastera) {
		super(imeIPrezime, jMBG, brIndexa);
		this.ocenaMastera = ocenaMastera;
	}

	public int getOcenaMastera() {
		return ocenaMastera;
	}

	public void setOcenaMastera(int ocenaMastera) {
		this.ocenaMastera = ocenaMastera;
	}


	public void stampaj() {
		super.stampaj();
		System.out.println(", " + this.ocenaMastera);
	}

}
