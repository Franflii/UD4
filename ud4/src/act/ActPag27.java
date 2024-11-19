package act;

public class ActPag27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calculadora(1.0,2.0,1));
	}
	
	static double calculadora(double num1,double num2,int operacion) {
		
		double resultado = 0.0;
		switch(operacion) {
			
			case 1:
				resultado = num1 + num2;
				break;
			
			case 2:
				resultado = num1 - num2;
				break;
				
			case 3:
				resultado = num1 * num2;
				break;
				
			case 4:
				resultado = num1 / num2; 
				break;
			
				
		}
		return resultado;

	}
}
