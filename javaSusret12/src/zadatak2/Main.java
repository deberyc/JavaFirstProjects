package zadatak2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*U glavnom programu kreirati 2 studenta i 2 profesora */
		
		Student s1 = new Student("Milovan Pocek", 2973492473982794379l, "P024/07");
		Student s2 = new Student("Petar petrovic", 12123123123l, "P343/08");
		Profesor p1 = new Profesor("Kosta Josifitis", 2312313131233l, "Makroekonomija");
		Profesor p2 = new Profesor("Misa Misic", 423423423542345l, "Elektriku");
		
		s1.stampaj();
		s2.stampaj();
		p1.stampaj();
		p2.stampaj();
		
		
		StudentOsnovne o1 = new StudentOsnovne("Janko Jankovic", 7483274328432l, "50/10", 9);
		StudentMaster m1 = new StudentMaster("Ivana Simic", 748345432l, "80/05", 10);
		
		o1.stampaj();
		m1.stampaj();
		
		
	}
		
	

}


