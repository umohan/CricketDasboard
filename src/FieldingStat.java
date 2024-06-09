
public class FieldingStat {
	int noOfCatch;
	int noOfStump;
	int noOfRunOut;
	
	public FieldingStat() {
		this.noOfCatch = 0;
		this.noOfStump = 0;
		this.noOfRunOut = 0;
	}
	
	public void addStump()
	{
		this.noOfStump+=1;
	}
	
	public void addRunOut()
	{
		this.noOfRunOut+=1;
	}
	
	public void addCatchOut()
	{
		this.noOfCatch+=1;
	}

}
