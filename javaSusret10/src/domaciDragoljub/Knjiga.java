package domaciDragoljub;

public class Knjiga {

	
/*	Kreirati klasu Knjiga koja ima:
		-ISBN
		-naziv
		-godina izdanja
		-autor
		-konstuktore koje mislite da su vam potrebni
		-gettere i settere za atribute
		
		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
		(ISBN)
		(naziv) - (godina izdanja)
		autor: (ime autora) (prezime autora)*/

	
		private String brojISBN;
		private String naziv;
		private int godinaIzdanja;
		private String imeAutora;
		private String prezimeAutora;
		
		public Knjiga(String brojISBN, String naziv, int godinaIzdanja, String imeAutora, String prezimeAutora) {
			
			this.brojISBN = brojISBN;
			this.naziv = naziv;
			this.godinaIzdanja = godinaIzdanja;
			this.imeAutora = imeAutora;
			this.prezimeAutora = prezimeAutora;
		}

		public String getBrojISBN() {
			return brojISBN;
		}

		public void setBrojISBN(String brojISBN) {
			this.brojISBN = brojISBN;
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public int getGodinaIzdanja() {
			return godinaIzdanja;
		}

		public void setGodinaIzdanja(int godinaIzdanja) {
			this.godinaIzdanja = godinaIzdanja;
		}

		public String getImeAutora() {
			return imeAutora;
		}

		public void setImeAutora(String imeAutora) {
			this.imeAutora = imeAutora;
		}

		public String getPrezimeAutora() {
			return prezimeAutora;
		}

		public void setPrezimeAutora(String prezimeAutora) {
			this.prezimeAutora = prezimeAutora;
		}
		
		public void printKnjige() {
			
			System.out.println("(" + this.brojISBN + ")" + "\n" + "(" + this.naziv + ") - (" + this.godinaIzdanja + ")" + 
									"\n" + "autor: " + "(" + this.imeAutora + ")" + " " + "(" + this.prezimeAutora + ")");
		}
		
		
		
		
		
}
