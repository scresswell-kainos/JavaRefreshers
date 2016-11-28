package diceGames;

public class HaloFleetBattlesDiceClass extends DiceClass {

	//Attributes
	private String diceResult;

	//constructor
	public HaloFleetBattlesDiceClass () {
		super(6);
	}

	public String rollHaloDice(){
		int diceVal = rollDice();

		switch(diceVal)
		{
		case 1:
			diceResult = "Skull";
			break;
		case 2:
		case 3:
			diceResult = "N/A";
			break;
		case 4:
		case 5:
			diceResult = "One hit";
			break;
		default:
			diceResult = "Two hits";

		}

		return diceResult;
	}

	public int getDiceValue(){
		int diceVal;
		diceVal = super.getDiceValue();

		switch(diceVal){
		case 4:
		case 5:
			return 1;
		case 6:
			return 2;
		default:
			return 0;
		}
	}
	
	public String getDiceResult(){
		return diceResult;
	}
}
