package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgExcption.DeckException;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		final int FACECARDVALUE = 10;
		iScore[0] = 0;
		iScore[1] = 0;
		
		
		boolean bAce = false;
		for (Card c: cards)
		{
			switch(c.geteRank())
			{
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
				iScore[0] += c.geteRank().getiRankNbr();
				break;
			case JACK:
			case QUEEN:
			case KING:
				iScore[0] += FACECARDVALUE;
				break;
			case ACE:
				iScore[0] += 1;
				bAce = true;
			}
			
			//iScore[0] += c.geteRank().getiCardValueMin();
			//if (c.geteRank() == eRank.ACE)
			//	bAce = true;
		}
		iScore[1] = (bAce) ? iScore[0] + eRank.ACE.getiCardValueMax() - eRank.ACE.getiCardValueMin() : iScore[0];
			
		SetHandScore(iScore);
		
		return iScore;
	}
	
	public void Draw(Deck d) throws DeckException
	{
		// add a card to 'cards' from a card drawn from Deck d
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
	public boolean bCanDealerHit()
	{
		
		for(int iScore : ScoreHand())
		{
			if(iScore >= 17)
				return false;
		}
		return true;
	}
	
	public boolean bCanplayerDraw()
	{
		for (int iScore: ScoreHand())
		{
			if(iScore < 21)
				return true;
		}
		return false;
	}
	
	public boolean isBlackJack()
	{
		int[] iScores = ScoreHand();
		
		if ((iScores[1] == 21) && (cards.size() == 2))
			return true;
		return false;
	}
	
	public void SetHandScore(int[] Scores)
	{
		this.iScore = Scores[0];
		if (Scores[1] <= 21)
			iScore = Scores[1];
	}
}
