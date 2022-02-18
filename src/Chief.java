
public class Chief extends FullTime {
	
	public void calculatechief() 
	{
		for(int y=0;arrayper.length>y;y++){ 
			String[] words=arrayper[y][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);
        	if(word.equals("C")) {
        		severancePay(y);
                dayOfWork(125);// 125 TL per day
                overWorkSalaryfulltime(y,8,15);//max 8 hours a week and are paid 15 TL per hour
                int totalchief=(int) (severancepay+dayofwork+totalfull);
                String salarychief=String.valueOf(totalchief);//converting int to string
                arrayper[y][9]=salarychief;
        	}

		}
        	      
	}

	public void main() {
		calculatechief();

	}

}
