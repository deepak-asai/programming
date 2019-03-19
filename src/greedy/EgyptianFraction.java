package greedy;

public class EgyptianFraction {
	
	public double gnr, gdr;
	public int reduce(int nr, int dr) {
		if (dr == 0) 
	        return nr; 
	      return reduce(dr, nr % dr);  
		
	}
	public void egypFrac() {
		
		if(gnr == 1) {
			System.out.println("1/"+gdr);
			return;
		}
		int n = (int) Math.ceil(gdr/gnr);
		System.out.println("1/"+n);
		gnr= gnr*n - gdr;
		gdr= gdr*n;
		int gcd = reduce((int)gnr, (int)gdr);
		gnr= gnr/(double)gcd;
		gdr= gdr/(double)gcd;
		egypFrac();
	}
	
	public void algo() {
		gnr = 83; gdr= 13;
		
		int n = (int) Math.ceil(gdr/gnr);
		System.out.println("1/"+n);
		gnr= gnr*n - gdr;
		gdr= gdr*n;
		egypFrac();
		
	}
	public static void main(String[] args) {
		EgyptianFraction ef= new EgyptianFraction();
		//System.out.println(ef.reduce(4, 42));
		
		ef.algo();
	}
}
