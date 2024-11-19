package act;

public class ActPag26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numeroDivisores(12));
	}
	
	static int numeroDivisores(int n) {
		int contador = 0;
		
		for(int i = 2; i <= n;i++) {
			if(n % i == 0 && ActPag25.esPrimo(i)) {
				contador++;
			}
		}
		return contador;

	}

}
