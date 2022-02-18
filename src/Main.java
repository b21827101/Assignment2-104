import java.io.IOException;
public class Main {
	public static String argument3;
	public static String argument4;
	
	public static void main(String[] args) throws IOException {
		String argument1=args[0];//First argument personnel.txt
		String argument2=args[1];//Second argument monitoring.txt
		argument3=argument1;
		argument4=argument2;
		Reading read=new Reading();
		read.main();
		Personnel person=new Personnel();
		person.main();
		FacultyMembers facultym=new FacultyMembers();
		facultym.main();
		ResearchAsistants researcha=new ResearchAsistants();
		researcha.main();
		Officer office=new Officer();
		office.main();
		Security security1=new Security();
		security1.main();
		PartTime part1=new PartTime();
		part1.main();
		Worker worker1=new Worker();
		worker1.main();
		Chief chief1=new Chief();
		chief1.main();
		WritingFile writing=new WritingFile();
		writing.main(args);
	}
}
