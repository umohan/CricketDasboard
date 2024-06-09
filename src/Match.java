
public class Match {
	
	Team A;
	Team B;
	public void addFirstTeam(Team a)
	{
		this.A = a;
	}
	
	public void addSecondTeam(Team b)
	{
		this.B = b;
	}
	
	public void start()
	{
		makeToss();
		startGame();
	}
	
	
	public void finish()
	{
		
	}
	
	public void makeToss()
	{
		this.A.addtoss(false);
		this.B.addtoss(true);
	}
	
	public void startGame()
	{
		startInning1();
		startInning2();
	}
	
	public void startInning1()
	{
		
		
		for(int i=0;i<20;i++)
		{
			Over o = new Over();
			Player onStrike = this.A.plyrs.get(0);
			Player bowler = this.A.plyrs.get(7);
			
			for(int j=0;j<6;j++)
			{
				//
				//decrement in case of Extra
			}
			
		}
	}
	
	public void startInning2()
	{
		
	}
}
