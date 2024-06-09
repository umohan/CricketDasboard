
public class ScoreBoard {

	
	
	public void getBattingScoreCard(Team t)
	{
		for(Player item : t.plyrs)
		{
			if(item.batStats != null)
			{
				System.out.println(item.Name+" "+item.batStats.getScore()+" "+item.batStats.noOfFour+" "+item.batStats.noOfSix+" "+item.batStats.getStrikeRate());
			}
		}
	}
	
	public void getBowlingScoreCard(Team t)
	{
		for(Player item : t.plyrs)
		{
			if(item.bowlStat != null)
			{
				System.out.println(item.Name+" "+item.bowlStat.getTotalNoofOver()+" "+item.bowlStat.getTotalRun()+" "+item.bowlStat.getTotalNoOfwicket());
			}
		}
	}
}
