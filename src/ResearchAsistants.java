public class ResearchAsistants extends Academician {
	
	public void calculateresearch() 
	{
		for(int i=0;arrayper.length>i;i++){ 
			String[] words=arrayper[i][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);//we got the first letter
        	if(word.equals("R")) {
                ssBenefits((float) 1.05);//%105 for research asistants
                severancePay(i);
                int total=(int) (service_benefits+base_salary+severancepay);
        		String salary=String.valueOf(total);//converting int to string
        		arrayper[i][9]=salary;
        	}        
		}   
	}

	public void main() 
	{
		calculateresearch();//servicebenefits,basesalary,severancepay for research asistants
		
	}
}
