public class Employee extends Personnel{
	
	protected int total3;
	
	public void hourOfWorkpart(int part) 
	{
		int x=0;
		while(x<4) {
			int hourpart=Integer.parseInt(arrayper[part][x+5]);
			if(20>=hourpart && hourpart>=10) {//min 10 hours,max 20 hours and 18 TL per hour.
				total3=total3+(hourpart*18);
			}
			else if(hourpart>20) {
				total3=total3+(20*18);
			}
			else if(hourpart<10){//works less than 10 hours, won't get salary
				total3=total3;
			}
			x++;
		}
	}

}
