import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingFile {

	public static void main(String[] args) throws IOException {
		Reading read1=new Reading();
		Personnel person1=new Personnel();
		FacultyMembers facultym1=new FacultyMembers();
		ResearchAsistants researcha1=new ResearchAsistants();
		Officer office1=new Officer();
		Security security2=new Security();
		PartTime part2=new PartTime();
		Worker worker1=new Worker();
		Chief chief1=new Chief();
		for(int i=0;chief1.arrayper.length>i;i++) {
			PrintWriter out= new PrintWriter(chief1.arrayper[i][1]+".txt");//dynamically getting the output txt name
			String[] words=chief1.arrayper[i][0].split(" ");
			String word = String.valueOf(words[0]);
			String word1= String.valueOf(words[1]);
			out.println("NAME : "+word);
			out.println("SURNAME : "+word1);
			float x= Float.parseFloat(chief1.arrayper[i][9]);
			String total1=String.format("%.2f", x);
			total1=total1.replace(",", ".");
			out.println("Registiration Number : "+chief1.arrayper[i][1]);
			out.println("Position : " + chief1.arrayper[i][2]);
			out.println("Year of Start : "+ chief1.arrayper[i][3]);
			out.println("Total Salary : "+ total1+" TL");	
		out.close();
		}
	
	}
}
