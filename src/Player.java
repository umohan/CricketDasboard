
public class Player {
	String Name;
	int Age;
	String Bio;
	PlayerType pType;
	BowlingStats bowlStat;
	BattingStats batStats;
	FieldingStat fldStats;
	
	
	Player(String Name, int age, String Bio, PlayerType pType)
	{
		this.Name = Name;
		this.Age = age;
		this.Bio = Bio;
		this.pType = pType;
		
	}
	
	public void createBowlingStat()
	{
		this.bowlStat = new BowlingStats();
	}
	
	public void createBattingStat()
	{
		this.batStats = new BattingStats();
	}
	
	public void createFieldingStat()
	{
		this.fldStats = new FieldingStat();
	}
}
