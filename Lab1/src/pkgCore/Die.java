package pkgCore;
import java.util.Random;
public class Die {
	 
	private int DieValue;
	
	public Die() {
		// TODO: Determine DieVaue.. a random number between 1 and 6							
		Random random = new Random();							
		DieValue = random.nextInt(6)+1;			
	}
	
	public int getDieValue() {
		return DieValue;
	}
}
