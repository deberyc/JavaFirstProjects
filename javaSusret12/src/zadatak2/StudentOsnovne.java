package zadatak2;

public class StudentOsnovne extends Student {
	
	
	private int ocenaDiplomskog;

	public StudentOsnovne(String imeIPrezime, long jMBG, String brIndexa, int ocenaDiplomskog) {
		super(imeIPrezime, jMBG, brIndexa);
		this.ocenaDiplomskog = ocenaDiplomskog;
	}

	public int getOcenaDiplomskog() {
		return ocenaDiplomskog;
	}

	public void setOcenaDiplomskog(int ocenaDiplomskog) {
		this.ocenaDiplomskog = ocenaDiplomskog;
	}
	
	public void stampaj() {
		super.stampaj();
		System.out.println(", "  + this.ocenaDiplomskog);
	}
	
	

}
