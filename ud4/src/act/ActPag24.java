package act;

public class ActPag24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("La letra a es una vocal." + esVocal("a"));
	}
	
	static boolean esVocal(String caracter) {
		
		boolean resultado;
		
		if(caracter.equalsIgnoreCase("a") || caracter.equalsIgnoreCase("e") || caracter.equalsIgnoreCase("i") || caracter.equalsIgnoreCase("o") || caracter.equalsIgnoreCase("u") ) {
			resultado = true;
		}
		else {
			resultado = false;
		}
		return resultado;
	}

}
