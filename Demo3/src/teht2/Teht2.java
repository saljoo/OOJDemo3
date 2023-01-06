package teht2;

class Asiakas{
	String nimi;
	String sposti;
	String puhNum;
	
	//Metodeina getterit ja setterit parametreille
}

class Kirja{
	String nimi;
	String kirjoittaja;
	String tyylilaji;
	int sivumaara;
	
	//Metodeina getterit ja setterit parametreille
}

class Varasto{
	static int saatavuus;
	Kirja haluttuKirja;
	
	public static void muutaSaatavuutta(boolean lainaus) {
		if(lainaus) {
			saatavuus--;
		}else {
			saatavuus++;
		}
	}
}

class Lainaus{
	String paivamaara;
	Asiakas lainaaja;
	Kirja lainattavaKirja;
	
	Varasto.muutaSaatavuutta(true);
}

class Palautus{
	String paivamaara;
	Asiakas palauttaja;
	Kirja palautettavaKirja;
	
	Varasto.muutaSaatavuutta(false);
}

public class Teht2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
