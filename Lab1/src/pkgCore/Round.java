package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore		
		ComeOutScore = new Roll().getScore();		
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) 
		{
			this.eGameResult = eGameResult.CRAPS;
		}
		else if (ComeOutScore == 7 || ComeOutScore == 11) 
		{
			this.eGameResult = eGameResult.NATURAL;
		}	
		else {			
			rolls.add(new Roll());
			while (new Roll().getScore() != 7 &&  new Roll().getScore() != ComeOutScore) 
			{				
				rolls.add(new Roll());						
				if (ComeOutScore == 7)
				{		
					this.eGameResult = eGameResult.SEVEN_OUT;
				}
							else if (ComeOutScore == 4 || ComeOutScore == 5 || ComeOutScore == 6 || ComeOutScore == 8 || ComeOutScore == 9 || ComeOutScore == 10) 
							{				
								this.eGameResult = eGameResult.POINT;
							}
		// TODO: value the eGameResult after the round is complete
			}		
		}
	}
	public int RollCount() {
		// Return the roll count
		return rolls.size();
	}
	public static void main(String [] args)
	{
		Round round = new Round();
		System.out.print(round.RollCount());
	}	
}
