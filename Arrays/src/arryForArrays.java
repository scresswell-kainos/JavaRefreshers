	import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class arryForArrays {

	private int numPeople;
	

	public void setNumPeople (int n){
		numPeople = n;
	}
	
	
	public int winnerIs(){
		return ((int)(Math.random()*numPeople));
	}
	
	public String[] getPeople(){
		String[] listOfPeople = {
				"Annie",
				"Bob",
				"Craig",
				"Donna",
				"Eddie",
				"Fran",
				"Georgina"
		};
		return listOfPeople;
	}

	@Test
	public void main() {
		//variation 1 - using an array, which is fixed size
		System.out.println("----------");
		System.out.println("Selecting a winner v1");

		String[] people = getPeople();
		setNumPeople(people.length);
		assert(numPeople>0); //will fail if you change this to numPeople<2
		System.out.println(people[winnerIs()]);
		
		//variation 2 - using an ArrayList, which can be added to, removed etc
		System.out.println("----------");
		System.out.println("Selecting a winner v2");

		List<String> entrants = new ArrayList<String>();
		entrants.add("Annie");
		entrants.add("Bob");
		entrants.add("Craig");
		entrants.add("Donna");
		entrants.add("Eddie");
		entrants.add("Fran");
		entrants.add("Georgina");
		
		setNumPeople(entrants.size());
		assert(numPeople>0); //will fail if you change this to numPeople<2
		System.out.println(entrants.get(winnerIs()));		
	}
	
}
