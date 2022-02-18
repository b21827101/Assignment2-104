public class Personnel{
	
	protected static String[][] arrayper;//Combination of personnel array and monitoring array
	protected int yearofstart;
	protected int currentyear=2020;
	protected int severancepay;
		
	public void severancePay(int i) 
	{//severance pay for all personnel
		yearofstart=Integer.parseInt(arrayper[i][3]);
		severancepay=(currentyear - yearofstart) * 20 * 8/10;
	}
	

	public void main()
	{
		Reading read=new Reading();
		arrayper=new String[read.array3.length][10];

        for(int i=0;read.array3.length>i;i++) {    	
        	for (int j=0;read.array3[i].length>j;j++) {
                arrayper[i][j] = read.array3[i][j];}//adding array3 to arrayper
        }
        for(int i=0;read.array4.length>i;i++) {    	
        	for (int j=0;read.array4[i].length>j;j++) {
                arrayper[i][j+(read.array3[0].length)] = read.array4[i][j];}//adding array4 to arrayper
        }         
    }		
}
	



