
import java.util.*;

class Wicket
{
	Player catchBy;
	WicketType wt;
	Player bowledBy;
	Player bowledTo;
	Player batter;
	Player stumpBY;
	Player runOutBy;
	
	Wicket(Player bowledBy, Player bowledTo, WicketType wktType)
	{
		 this.bowledBy  = bowledBy;
	     this.bowledTo = bowledTo;
	     this.wt = wktType;
	}
	
	public void CaoughtBy(Player plyr)
	{
		this.catchBy = plyr;
	}
	
	public void stumpBy(Player stmpBy)
	{
		this.stumpBY = stmpBy;
	}
	
	public void runOutBy(Player runOutBy)
	{
		this.runOutBy = runOutBy;
	}
}

class Bowl
{
	BowlType bType;
	BowlResult res;
	Wicket wkt;
	int score;
	
	Bowl(BowlType bType)
	{
		this.bType = bType;
		this.score = 0;
	}
	
	public void addBowl(BowlResult bRes, BowlType bType)
	{
		this.res = bRes;
		this.bType = bType;
	}
	
	public void addWicket(Wicket wkt)
	{
		this.wkt = wkt;
	}
}


public class Over {
	int noOfBall;
	int totalScore;
	List<Bowl> bwl;
	Over()
	{
		this.noOfBall = 0;
		this.totalScore = 0;
		this.bwl = new ArrayList<Bowl>();
	}
	
	public void addBowl(Bowl b)
	{
		bwl.add(b);
		this.totalScore += b.score;
		this.noOfBall += 1;
	}
	
}
