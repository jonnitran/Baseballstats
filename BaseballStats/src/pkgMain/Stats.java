package pkgMain;
import java.util.Scanner;

import pkgMain.Player;

public class Stats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Player name: ");
		String playername = scan.next();
		Player p1 = new Player(playername);
		
		System.out.print("At Bats: ");
		p1.setAb(scan.nextInt());
		
		System.out.print("Hits: ");
		p1.setH(scan.nextInt());
		
		System.out.print("Doubles:  ");
		p1.set_2b(scan.nextInt());
		
		System.out.print("Triples: ");
		p1.set_3b(scan.nextInt());
		
		System.out.print("Home Runs: ");
		p1.setHr(scan.nextInt());
		
		System.out.print("Runs: ");
		p1.setR(scan.nextInt());
		
		System.out.print("Walks: ");
		p1.setBb(scan.nextInt());
		
		scan.close();
		
		System.out.println(p1.get_2b());
		System.out.println(p1.get_3b());
		System.out.println(p1.getAb());
		System.out.println(p1.getBb());
		
		
		
		
		double battingaverage = Player.battingAverage(p1.ab,p1.h);
		double onbasepercentage = Player.onbasepercentage(p1.h, p1.bb, p1.ab);
		double sluggingpercentage = Player.sluggingpercentage(p1.h,p1._2b,p1._3b,p1.ab,p1.hr);
		double onbaseslugging = Player.onbaseslugging(sluggingpercentage, onbasepercentage);
		int totalbases = p1.totalbases(p1._2b, p1._3b, p1.hr, p1.bb, p1.r);
		
		System.out.println("Batting average: " + battingaverage);
		System.out.println("On base percentage: " + onbasepercentage);
		System.out.println("Slugging percentage: " + sluggingpercentage);
		System.out.println("On base slugging: " + onbaseslugging);
		System.out.println("Total bases: " + totalbases);


	}
}
