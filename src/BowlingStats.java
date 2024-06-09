import java.util.ArrayList;
import java.util.List;

public class BowlingStats {
	List<Over> overs;
	List<Wicket> wkts;
	int totalRun;
	
	public BowlingStats() {
		overs = new ArrayList<>();
		wkts = new ArrayList<>();
		totalRun = 0;
	}
	
	public void addbowl(Bowl bwl)
	{
		totalRun += bwl.score;
	}
	

	public void addWicket(Wicket wkt)
	{
		wkts.add(wkt);
	}
	

	public int getTotalRun()
	{
		return totalRun;
	}
	
	public int getTotalNoOfwicket()
	{
		return wkts.size();
	}
	
	public int getTotalNoofOver()
	{
		return overs.size();
	}
	
}
