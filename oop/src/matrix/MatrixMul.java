package matrix;

public class MatrixMul {
	public static void main(String[] args) {
		int[][]mtx = new int[5][5];
		int n = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				n +=5;
				mtx[i][j]=n;
				System.out.print(mtx[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
