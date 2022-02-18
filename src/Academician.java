
public class Academician extends Personnel {
	
	protected int totaladdcourse;
	protected int base_salary=2600;
	protected float service_benefits;
	
	public void addCourseFee(int ad) //for faculty members only
	{
		int x=0;
		while(x<4) {
			int hour=Integer.parseInt(arrayper[ad][x+5]);
			if(hour>=48) {//more than 8 hours in a week, they will be paid only for 8 hours
				totaladdcourse=totaladdcourse+(20*8);
			}
			else if(hour<48){
				totaladdcourse=totaladdcourse+((hour-40)*20);
			}
			x++;
		}
	}
	public void ssBenefits(float x) 
	{
		service_benefits=base_salary*x;// x=%135 faculty member,x= %105 research assistant
	}
}
