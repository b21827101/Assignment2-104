import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reading {
	public static String[][] array3;
	public static String[][] array4;
	

	public static String[] readFile(String path) {
		try {
		int i=0;
		int length = Files.readAllLines(Paths.get(path)).size();
		String[] results = new String[length];
			for (String line : Files.readAllLines(Paths.get(path))) {
				results[i++] = line ;
				
			}
		return results;
		}catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	public void main() {
		Main getmain=new Main();
		String[] lines = readFile(getmain.argument3);//reading personnel.txt getmain.argument3 
		String[][] array1 = new String[lines.length][];//adjusting the length of the array1
		int z=0;
		for (String line:lines) {
			String[] pieces = line.split("\t");//separation from tab
			array1[z]=new String[pieces.length];//adjusting the length of the each row
			for(int i=0;pieces.length>i;i++) {
				array1[z][i]=(String)pieces[i];			
			}	
			z+=1;
		}	
		String[] lines1 = readFile(getmain.argument4);//reading monitoring.txt getmain.argument4
		String[][] array2 = new String[lines1.length][];//adjusting the length of the array1
		int x=0;
		for (String line1:lines1) {
			String[] pieces1 = line1.split("\t");//separation from tab
			array2[x]=new String[pieces1.length];//adjusting the length of the each row
			for(int j=0;pieces1.length>j;j++) {
				array2[x][j]=(String)pieces1[j];			
			}	
			x+=1;
		}
		array3=array1.clone();
		array4=array2.clone();
	}	
}
