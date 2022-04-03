import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class main implements Constants {

	public static void main(String []args) throws IOException {
		HashMap<String,String> links = new HashMap<String,String>();
		links.put("https://www.uwindsor.ca/", "Uwindsor");
    	links.put("https://www2.uottawa.ca/en","Uottwa");
    	links.put("https://www.uoguelph.ca/", "UGulph");
    	
    	System.out.println("Started converting html files to text");
    	
		Linktotext.htmlToTextParser(links);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to Find:");
		String strToFind = sc.nextLine(); 
		
		Object[] key = links.keySet().toArray();
		String[] URL = Arrays.stream(key).toArray(String[]::new);
		
		Object[] fname = links.values().toArray();
		String[] fileName = Arrays.stream(fname).toArray(String[]::new);
		
		HashMap<String,Integer> count = new HashMap<>();
		
		count = Ranking_final.Counting(URL, fileName, strToFind);
		Ranking_final.sortIndex(count);
	
	}
	
	
}
