package act;

public class ActPag30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	static int maximo(int a, int b) {
		int resultado = b;
		
		if(a > b) {
			resultado = a;
		}
		
		return resultado;
	}
	
	//1 2 3
	static int maximo(int a,int b, int c) {
		int resultado = maximo(a, b);

		return maximo(resultado, c);
	}
	

}
