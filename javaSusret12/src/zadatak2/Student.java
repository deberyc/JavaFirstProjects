package zadatak2;

	public class Student extends Osoba{
		
		
		/*	Kreirati klasu Student koja nasledjuje klasu Osoba,
		koja od dodatnih atributa ima:
		
		• broj indeksa
		• konstuktor sa parametrima
		
		• metodu stampaj koja stampa podatke u formatu:
		ime prezime, jmbg, broj indeksa */
		
		
		
		private String brIndexa;
		
		public Student(String imeIPrezime, long jMBG, String brIndexa) {
			super(imeIPrezime, jMBG);
			this.brIndexa = brIndexa;
		}
		
		public String getBrIndexa() {
			return brIndexa;
		}
		public void setBrIndexa(String brIndexa) {
			this.brIndexa = brIndexa;
		}
		public void stampaj() {
			super.stampaj();
			System.out.print(", " + this.brIndexa);
		}

}
