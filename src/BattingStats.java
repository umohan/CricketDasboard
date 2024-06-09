import java.util.*;
public class BattingStats {
	int BowlPlayed;
	List<Bowl> bwls;
	int totalrun;
	Wicket wkt;
	int noOfFour;
	int noOfSix;
	int noOfSingle;
	int noOfDoubel;
	int noOftriple;
	int noOfBowl;
	
	public BattingStats() {
		bwls = new ArrayList<>();
	}
	
	public void addbowl(Bowl bwl)
	{
		totalrun += bwl.score;
		bwls.add(bwl);
		noOfBowl += 1;
	}
	
	public double getStrikeRate()
	{
		if(noOfBowl == 0)
			return 0;
		
		int strikerate = (totalrun *100)/noOfBowl;
		return (double)(strikerate)/100d;
	}
	
	
	public int getScore()
	{
		return totalrun;
	}
	
	public Wicket getwicket()
	{
		return this.wkt;
	}
	
	public int toNoOffour()
	{
		return this.noOfFour;
	}
	
	public int toNoOfSix()
	{
		return this.noOfSix;
	}
	
	
}
