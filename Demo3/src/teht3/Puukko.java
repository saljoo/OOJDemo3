package teht3;

class Puukko extends Tyokalu{
	
	public Puukko() {
		
	}
	
	public void kaytaPuukkoa() {
		System.out.println("T�k!");
	}
	public boolean onkoTeroitettava() {
		return true;
	}
	@Override
	public String toString() {
		return "Puukko";
	}
}
