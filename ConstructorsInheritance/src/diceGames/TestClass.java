package diceGames;

import org.junit.Test;
//import static org.junit.Assert.*;


public class TestClass {

//	@Test
//	public void testD20(){
//		DiceClass dice1 = new DiceClass(20);
//		for (int count=0; count <20; count++) dice1.rollDice();
//	}
//	
//	@Test
//	public void testDefault(){
//		DiceClass dice1 = new DiceClass();
//		for (int count=0; count <20; count++) dice1.rollDice();
//	}
//	
////	@Test
////	public void testPrivateVsPublic(){
////		DiceClass dice1 = new DiceClass();
////		dice1.diceRollValue =-1;
////	}
//	
//	@Test
//	public void testHaloDefault()
//	{
//		HaloFleetBattlesDiceClass dice1 = new HaloFleetBattlesDiceClass();
//		
//		for (int count=0;count < 6;count++)
//		{
//			dice1.rollHaloDice();
//			System.out.println(" Value on dice is " + dice1.getDiceResult());
//			System.out.println(" Number of hits caused is " + dice1.getDiceValue());
//
//		}
//	}
	
	@Test
	public void testCraps(){
		DiceGroupClass cupOfDice = new DiceGroupClass(4);
		cupOfDice.sumAllDice();
	}
	
}
