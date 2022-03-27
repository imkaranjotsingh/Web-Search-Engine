package WebCrawler;

import WebCrawler.crawler;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<crawler> bots = new ArrayList<>();
		bots.add(new crawler("https://www.geeksforgeeks.org/", 1));
		bots.add(new crawler("https://www.javatpoint.com/", 2));
		bots.add(new crawler("https://www.uwindsor.ca/", 3));
		
		for( crawler cw: bots) {
			try {
				cw.getThread().join();
				
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		

	}

}
