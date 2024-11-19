package act;

public class ActPag25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(esPrimo(8));
	}
	
	static boolean esPrimo(int n) {
		boolean resultado = true;
		
		for(int i = 2; i < n; i++) {
			
			if(n % i == 0) {
				
				resultado = false;
			}
		
		}
		
		return resultado;
		
		
	}

}
 