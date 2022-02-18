
public class Worker extends FullTime {

	public void calculateworker() {
		for(int y=0;arrayper.length>y;y++){ 
			String[] words=arrayper[y][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);
        	if(word.equals("W")) {
        		severancePay(y);
        		dayOfWork(105);// 105 TL per day
        		overWorkSalaryfulltime(y,10,11);//max 10 hours a week and are paid 11 TL per hour
        		int totalworker=(int) (severancepay+dayofwork+totalfull);
                String salaryworker=String.valueOf(totalworker);
                arrayper[y][9]=salaryworker;   //appending salary in array 

        	}
		}
	}
	

	public void main() {
		calculateworker();

	}

}
