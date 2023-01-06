package teht3;

class Kirves extends Tyokalu{
	
	public Kirves() {
		
	}
	
	public void kaytaKirvesta() {
		System.out.println("Hak!");
	}
	public boolean onkoTeroitettava() {
		return true;
	}
	@Override
	public String toString() {
		return "Kirves";
	}
}
