public class PartTime extends Employee{
	
	public void calculateparttime() 
	{
		for(int i=0;arrayper.length>i;i++)
		{ 
			String[] words=arrayper[i][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);//getting the first letter
        	if(word.equals("P")) 
        	{
                severancePay(i);
                hourOfWorkpart(i);//min 10 hours,max 20 hours and 18 TL per hour.
                int totalpart=(int) (severancepay+total3);
        		String salarysecurity=String.valueOf(totalpart);
        		arrayper[i][9]=salarysecurity;//appending salary in array 
        	}        
		} 
	}

	public void main() {
		calculateparttime();//severancepay,hourofwork for parttime
	}

}
