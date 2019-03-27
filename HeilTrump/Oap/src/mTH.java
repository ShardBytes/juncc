import java.lang.Math;

public class mTH {
	public static void main(String[] args) {
	float hmotnost = 4000000;
	
	float r = 6378;
	float altt = 10000;
	double gravAcc = 9.81;
	double u = gravAcc*hmotnost;
	
	
	double orbitSize = 2*Math.PI* altt;
	
	double orbitSpeed = Math.sqrt(u*(2/orbitSize)-(1/altt));
		
		System.out.println(orbitSpeed);
}
}