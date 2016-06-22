package matrix;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int i =0; i < 2; i++) {
			for (int j=1; j < 10; j++) {
				
				for(int k=2+(4*i);k<6+(4*i);k++){
					System.out.print(k+"*"+j+"="+(j*k)+"\t");	
				}
				System.out.println();
			}
			
			System.out.println();
			
		}
	}
}
