package Programme;

public class PointGPS {

	double point;
	public PointGPS(double degree, double minute, double seconde) {
		point = degree + minute/60 + seconde/3600;
		
	}
	
	public double getPoint() {
		return point;
	}
	
	public static double getPointStatic (PointGPS p1) {
		return p1.getPoint();
	}
	
}
