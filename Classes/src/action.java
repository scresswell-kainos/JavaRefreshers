import org.junit.Test;
import static org.junit.Assert.*;

public class action {

	@Test
	public void firsttest()
	{
		DiceClass dice1 = new DiceClass();
		dice1.setNumSides(6);
		
		for (int count=0 ; count < 2 ; count ++)
		{
			dice1.rollDice();
		}
		
		assert(dice1.numSides()==6);

	}

}
