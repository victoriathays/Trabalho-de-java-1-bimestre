
public class Questão3 {
	public static void main(String[]args) {
		int a = 3;
		int b = -15;
		int c = 12;
			
		double delta = Math.pow(b, 2.0) - 4*a*c;
		double x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (- b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("resultado 1: "+x1);
		System.out.println("resultado 2: "+x2);
		
	}
}
