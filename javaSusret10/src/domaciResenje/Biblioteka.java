package domaciResenje;

/*	    U glavnom programu napraviti vise autora sa vise knjiga. */


public class Biblioteka {

    public static void main(String[] args) {

        Autor a1 = new Autor("Ivo", "Andric");
        Autor a2 = new Autor("Petar", "Petrovic");

        Knjige[] knjige = new Knjige[4];

        knjige[0] = new Knjige("123456789", "Na Drini cuprija", 1945, a1);
        knjige[1] = new Knjige("1987654321", "Most na Zepi", 1925, a1);
        knjige[2] = new Knjige("15987-587452-95", "Gorski vijenac", 1847, a2);
        knjige[3] = new Knjige("655-999-88-745", "Lazni car", 1851, a2);



        for (int i = 0; i < knjige.length; i++) {
            knjige[i].stampaKnjige();
            System.out.println("______________");
        }

    }

}
