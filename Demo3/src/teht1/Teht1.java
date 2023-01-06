package teht1;

public class Teht1 {

	public static void main(String[] args) {
		//Luodaan kuutioita ja tulostetaan niiden alat ja keskipisteet
		Kuutio kuutio1 = new Kuutio(4);
		Kuutio kuutio2 = new Kuutio(2.5);
		Kuutio kuutio3 = new Kuutio(7);
		System.out.println("Ala: " + kuutio1.annaAla() + ", keskipiste: " + kuutio1.annaKeskipiste());
		System.out.println("Ala: " + kuutio2.annaAla() + ", keskipiste: " + kuutio2.annaKeskipiste());
		System.out.println("Ala: " + kuutio3.annaAla() + ", keskipiste: " + kuutio3.annaKeskipiste());
	}

}
