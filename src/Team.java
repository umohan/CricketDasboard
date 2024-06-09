import java.util.*;
public class Team {
	List<Player> plyrs;
	int totalScore;
	boolean toss;
	boolean win;
	
	public void addPlayer(String Name, int age, String Bio, PlayerType pType)
	{
		Player p1 = new Player(Name, age, Bio, pType);
		plyrs.add(p1);
	}
	
	public void addtoss(boolean toss)
	{
		this.toss = toss;
	}
	
	public void isWinner(boolean winner)
	{
		this.win = winner;
	}
}
