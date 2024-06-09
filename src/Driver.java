
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team A = new Team();
		for(int i=0;i<11;i++)
		{
			A.addPlayer("ABCD"+i, i+20,"" ,PlayerType.BATTER);
		}

		Team B = new Team();
		for(int i=0;i<11;i++)
		{
			B.addPlayer("BCD"+i, i+20,"" ,PlayerType.BATTER);
		}
		
		Match m1 = new Match();
		m1.addFirstTeam(A);
		m1.addSecondTeam(B);
		
		m1.start();
		m1.finish();
	}

}
