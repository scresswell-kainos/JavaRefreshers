package diceGames;

import java.util.ArrayList;
import java.util.List;

public class DiceGroupClass {

	private List<DiceClass> diceList;
	
	//Constructors
	public DiceGroupClass(){
		this(2);
	}
	
	public DiceGroupClass (int num){
		diceList = new ArrayList<DiceClass>();
		setNumDice(num);
	}
	
	//Methods
	public void setNumDice (int size){
	
		//Add any dice needed
		while (diceList.size() < size){
			DiceClass newDice = new DiceClass();
			diceList.add(0, newDice);
		}
		
		while (diceList.size()>size)
		{
			diceList.remove(0);
		}
	}
	
	public void rollAllDice(){
		for(DiceClass thisDice:diceList){
			thisDice.rollDice();
		}
	}
	
	public int sumAllDice(){
		int total = 0;
		rollAllDice();
		for(DiceClass thisDice:diceList){
			total += thisDice.getDiceValue();
		}
		return total;
			
	}
}
