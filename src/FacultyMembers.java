
public class FacultyMembers extends Academician{
	
	public void calculate() 
	{
		for(int h=0;arrayper.length>h;h++){ 
			String[] words=arrayper[h][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);//we got the first letter
        	if(word.equals("F")) {
                ssBenefits((float) 1.35);//%135 for faculty members
                severancePay(h);
                addCourseFee(h);
                int totalfaculty=(int) (service_benefits+base_salary+severancepay+totaladdcourse);
        		String salary=String.valueOf(totalfaculty);
        		arrayper[h][9]=salary;   //appending salary in array     		
        	}
		}   
	}
	public void main
	() 
	{
		calculate();//servicebenefits,basesalary,severancepay,addcoursefee for faculty members
	}
}
