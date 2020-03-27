import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
class PrintLines{
	public static List<String> read_file(String fileName) {
		List<String> lines = Collections.emptyList();
		try{
			lines=Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
		return lines;
	}
	public static void array_list_generate(List<String> lines,int no_of_lines){
		ArrayList<String> listOfStrings = new ArrayList<>(lines.size());
		listOfStrings.addAll(lines);
		Random randomGenerator=new Random();
		for(int i=0;i<no_of_lines;i++){
			int index=randomGenerator.nextInt(listOfStrings.size());
			String item=listOfStrings.get(index);
			System.out.println(item);
		}
	}
	public static void linked_list_generate(List<String> lines,int no_of_lines){
		LinkedList<String> listOfStrings = new LinkedList<>();
		listOfStrings.addAll(lines);
		Random randomGenerator=new Random();
		for(int i=0;i<no_of_lines;i++){
			int index=randomGenerator.nextInt(listOfStrings.size());
			String item=listOfStrings.get(index);
			System.out.println(item);
		}
	}
	public static void main(String[] args) throws Exception{
		String fileName=args[0];
		int no_of_lines=Integer.parseInt(args[1]);
		
		List<String> lines=read_file(fileName);
		System.out.println("ArrayList implementation");
		System.out.println("---------------------------");
		array_list_generate(lines,no_of_lines);
		System.out.println();
		System.out.println("LinekdList implementation");
		System.out.println("---------------------------");
		linked_list_generate(lines,no_of_lines);
	}
}
