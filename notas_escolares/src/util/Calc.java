package util;

public class Calc {
	
	public double n1, n2, n3, n4;

	public static double Media(double n1, double n2, double n3, double n4 ) {
		return ( n1 + n2 + n3 + n4 ) / 4;
	}
	public static double qf ( double n1, double n2, double n3, double n4 ) {
		return 6 - ((n1 + n2 + n3 + n4) / 4) ;
		
	}
}
