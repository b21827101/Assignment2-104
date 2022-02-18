
public class FullTime extends Employee{ 
	
	protected int overwork;
	protected int totalfull;
	protected int dayofwork;
	
	public void overWorkSalaryfulltime(int full,int hourfull,int hoursalary) //for worker and chief y 10 11
	{
		totalfull=0;
		int x=0;
		while(x<4){
			overwork=Integer.parseInt(arrayper[full][x+5]);
			if((overwork-40)>=hourfull) {
				totalfull=totalfull+(hourfull * hoursalary);//Even if it pays wages according to max hours
			}
			else if((overwork-40)<hourfull) {
				totalfull=totalfull+(hoursalary*(overwork-40));
			}
			x++;
		}
	}
	public void dayOfWork(int daysalary) 
	{
		dayofwork=0;
		dayofwork=daysalary*20;//do not work at weekends.
	}
	
	
}
