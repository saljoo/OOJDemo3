package teht3;
import java.util.ArrayList;

class Tyokalupakki {
	ArrayList<Tyokalu> tyokalut = new ArrayList<>();
	
	public Tyokalupakki() {
		
	}
	
	public void lisaaTyokalu(Tyokalu tyokalu) {
		this.tyokalut.add(tyokalu);
	}
	public void lataaTyokaluja(ArrayList<Tyokalu> tyokalut) {
		
	}
	@Override
	public String toString() {
		return "" + tyokalut;
	}
}