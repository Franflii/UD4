package act;

public class ActPag23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		maximoAmbos(1,7);
	}
	
	static int maximoAmbos(int num1,int num2) {
		
		int resultado = num2;
		
		if(num1 > num2) {
			resultado = num1;
		}
		
		return resultado;
	}

}
