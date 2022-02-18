
public class Officer extends Personnel{
	protected int totaloverwork;
	protected int base_salary=2600;
	protected float service_benefitsofficer;
	
	public void ssBenefitsofficer(float x) 
	{
		service_benefitsofficer=base_salary*x;//x= %65 Officers
	}

	
	public void calculateofficer() 
	{
		for(int o=0;arrayper.length>o;o++)
		{ 
			String[] words=arrayper[o][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);//getting the first letter
        	if(word.equals("O")) {
                ssBenefitsofficer((float) 0.65); //%65 for officer
                severancePay(o);
                overWorkSalary(o);
                int totalofficer=(int) (service_benefitsofficer+base_salary+severancepay+totaloverwork);
        		String salaryofficer=String.valueOf(totalofficer);
        		arrayper[o][9]=salaryofficer;//appending salary in array 
        	}        
		} 
	}
	
	
	public void overWorkSalary(int ad) {
		int x=0;
		totaloverwork=0;
		while(x<4) {
			int hour1=Integer.parseInt(arrayper[ad][x+5]);
			if(hour1>=50) {//more than 10 hours a week,they are paid up to 10 hours
				totaloverwork=totaloverwork+(20*10);
			}
			else if(hour1<50){
				totaloverwork=totaloverwork+((hour1-40)*20);//10 hours a week and for each working hour, they are paid 20 TL.
			}
			x++;
		}
	}

	public void main() {
		calculateofficer();//servicebenefits,basesalary,severancepay,overworksalary for officer
	}
}
