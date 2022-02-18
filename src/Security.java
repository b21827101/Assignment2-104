public class Security extends Personnel {
	
	protected int foodMoney=10;
	protected int  transMoney=5;
	protected int totalhourofwork;	
	public void hourOfWork(int ad) {
		int x=0;
		while(x<4) {
			int hoursecurity=Integer.parseInt(arrayper[ad][x+5]);
			if(54>=hoursecurity && hoursecurity>=30) {// maximum of 9 hours and a minimum of 5 hours a day
				totalhourofwork=totalhourofwork+(hoursecurity*10);
				totalhourofwork+=(6*(foodMoney+transMoney));			
			}
			else if(hoursecurity>54) {
				totalhourofwork=totalhourofwork+(54*10);// For each working hour, they are paid 10 TL. 
				totalhourofwork+=(6*(foodMoney+transMoney));

			}
			else if(hoursecurity<30){
				totalhourofwork=totalhourofwork;//came less than 30 hours in a week, could not receive any salary.
			}
			x++;
		}
	}
	
	public void calculatesecurity() {
		for(int i=0;arrayper.length>i;i++)
		{ 
			String[] words=arrayper[i][1].split("");//splitting registration number 
			String word = String.valueOf(words[0]);//getting the first letter
        	if(word.equals("S")) {
                severancePay(i);
                hourOfWork(i);//max 54 hours in a week and min 30 hours in a week
                int totalsecurity=(int) (severancepay+totalhourofwork);
        		String salarysecurity=String.valueOf(totalsecurity);
        		arrayper[i][9]=salarysecurity;
        	}        
		} 
	}

	public void main() {
		calculatesecurity();//severancepay,hourofwork,transmoney,foodmoney for security
	}
}
