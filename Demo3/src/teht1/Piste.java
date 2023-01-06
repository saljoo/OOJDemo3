package teht1;

class Piste {
	double[] piste = new double[3];
	
	public Piste(double luku1, double luku2, double luku3) {
		piste[0] = luku1;
		piste[1] = luku2;
		piste[2] = luku3;
	}
	@Override
	public String toString() {
		return "(" + piste[0] + ", " + piste[1] + ", " + piste[2] + ")";
	}
}
