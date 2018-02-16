package pkgMain;

public class Player {
	int ab;
	int h;
	int _2b;
	int _3b;
	int hr;
	int r;
	int bb;
	String name;
	
public Player(String playername) {
	this.name = playername;
}		


	public int getAb() {
		return ab;
	}
	public void setAb(int ab) {
		this.ab = ab;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int get_2b() {
		return _2b;
	}
	public void set_2b(int _2b) {
		this._2b = _2b;
	}
	public int get_3b() {
		return _3b;
	}
	public void set_3b(int _3b) {
		this._3b = _3b;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	//Calculates batting average with hits/at bats
	public static double battingAverage(double ab, double hits) {
		double ba;
		ba = hits/ab;
		return ba;
}

	//Calculates on base percentage with (hits+walks)/(hits+walks+at bats)
	public static double onbasepercentage(double hits, double bb, double ab) {
		double obp = (hits+bb)/(hits+bb+ab);
		return obp;
	}

	/*Calculates slugging percentage with (runs+doubles+triples+homeruns)/at bats.
	 * I used runs because hits does not translate into going onto the bases but a run does.
	 * I used it at a single because we do not have an attribute for a single base taken.
	 */
	public static double sluggingpercentage(int runs, int doubles, int triples, double ab, int homerun) {
		
		double sp = (runs + doubles + triples + homerun) / ab;
		
		return sp;
	}
	
	//Calculates on base slugging with slugging percentage + on base percentage
	public static double onbaseslugging(double sp, double obp) {
		double obs;
		obs = (sp+obp);
		return obs;
	}
	
	/*Calculates total bases with doubles*2 + triples*3 + homeruns*4 + walks+ runs
	 * Same logic from slugging percentage as walks and runs counts as taking a single base which is added to the total
	 */
	public int totalbases(int doubles, int triples, int homerun, int walks, int runs) {
		int tb;
		tb = (doubles*2)+(triples*3)+(homerun*4)+walks+runs;
		return tb;
}

}