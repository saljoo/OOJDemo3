package teht3;

public class Teht3 {
	
	public static void main(String args[]) {
		Tyokalupakki tyokalupakki = new Tyokalupakki();
		Vasara vasara = new Vasara();
		Hiomakone hiomakone = new Hiomakone();
		Kirves kirves = new Kirves();
		Puukko puukko = new Puukko();
		Sahkosaha sahkosaha = new Sahkosaha();
		
		tyokalupakki.lisaaTyokalu(vasara);
		tyokalupakki.lisaaTyokalu(hiomakone);
		tyokalupakki.lisaaTyokalu(kirves);
		tyokalupakki.lisaaTyokalu(puukko);
		tyokalupakki.lisaaTyokalu(sahkosaha);
		
		System.out.println(tyokalupakki);
		vasara.kaytaVasaraa();
	}
}
