package teht1;

class Kuutio implements Kappale{
	protected double sivunPituus;
	protected Piste piste1;
	protected Piste piste2;
	protected Piste piste3;
	protected Piste piste4;
	protected Piste piste5;
	protected Piste piste6;
	protected Piste piste7;
	protected Piste piste8;
	private double ala;
	private Piste keskipiste;
	
	public Kuutio(double sivunPituus) {
		this.sivunPituus = sivunPituus;
		//Luodaan kahdeksan pistettä sivunpituuden perusteella, joista muodostuu kuutio
		this.piste1 = new Piste(0,0,0);
		this.piste2 = new Piste(sivunPituus,0,0);
		this.piste3 = new Piste(0,0,sivunPituus);
		this.piste4 = new Piste(0,sivunPituus,0);
		this.piste5 = new Piste(0,sivunPituus,sivunPituus);
		this.piste6 = new Piste(sivunPituus,sivunPituus,0);
		this.piste7 = new Piste(sivunPituus,0,sivunPituus);
		this.piste8 = new Piste(sivunPituus,sivunPituus,sivunPituus);
	}
	
	@Override
	public double annaAla() {
		ala = 6*Math.pow(this.sivunPituus, 2);
		return ala;
	}
	@Override
	public Piste annaKeskipiste() {
		keskipiste = new Piste(sivunPituus/2.0,sivunPituus/2.0,sivunPituus/2.0);
		return keskipiste;
	}
}
