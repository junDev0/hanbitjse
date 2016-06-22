package matrix;

public class SimpleMatrix {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print((n=n+1)+"\t");				
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
