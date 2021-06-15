package Zadatak1;

public class ReakcijeGlavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


/*Iz glavne klase instancirati par reakcija i postova i ispisati info o postovima*/
		
		FacebookPost f1 = new FacebookPost("Pedja Pocek", "Ja sam kralj");
		
		
		Reakcija s1 = new Reakcija("Smajli", "Milovan Pocek");
		Reakcija s2 = new Reakcija("Smajli", "Milovan Pocek");
		Reakcija s3 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s4 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s5 = new Reakcija("Srce", "Milovan Pocek");
		Reakcija s6 = new Reakcija("Like", "Milovan Pocek");
		Reakcija s7 = new Reakcija("Like", "Milovan Pocek");
		Reakcija josJedna = new Reakcija("Smajli", "Milos Misic");
		
		
		
		f1.reaguj(s1);
		f1.reaguj(s2);
		f1.reaguj(s3);
		f1.reaguj(s4);
		f1.reaguj(s5);
		f1.reaguj(s6);
		f1.reaguj(s7);
		f1.reaguj(josJedna); // dodajemo novu reakciju u niz
		
		for (int i = 0; i < 10; i++) {  // dodajemo jos 10 srca u listu
			f1.reaguj(s3);
		}
		f1.stampanjePodatakaOPostu();
		
		
		
	}

}
