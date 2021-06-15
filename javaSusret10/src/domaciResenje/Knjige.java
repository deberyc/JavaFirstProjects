package domaciResenje;

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


public class Knjige {

    private String isbn;
    private String naziv;
    private int godIzdanja;
    private Autor autor;
    
    public Knjige(String isbn, String naziv, int godIzdanja, Autor autor) {
        super();
        this.isbn = isbn;
        this.naziv = naziv;
        this.godIzdanja = godIzdanja;
        this.autor = autor;
    }
    
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public int getGodIzdanja() {
        return godIzdanja;
    }
    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaKnjige() {

        System.out.println("(" + isbn + ")\n(" + naziv + ")-(" + godIzdanja + ")");
        autor.stampaAutora();
    }

}
