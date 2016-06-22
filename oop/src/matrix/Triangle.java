package matrix;

public class Triangle {
	public static void main(String[] args) {
		String k[][] = new String[6][6];
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >0; j--) {
				if(i>=j){
					k[i][j] = String.valueOf(j);
					System.out.print(k[i][j]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
