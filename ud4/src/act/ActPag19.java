package act;

public class ActPag19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 1;
		double radio = 2;
		double altura = 4;
		
		calculaCilindro(opcion, radio, altura);
	}
	static void calculaCilindro(int opcion, double radio, double altura) {

		if(opcion == 1) {
			double area = 2*Math.PI * radio *(altura+radio);
			System.out.printf("El area es %.2f \n",area);
		}
		else if(opcion == 2){
			double volumen = Math.PI * Math.pow(radio, 2) * altura;
			System.out.printf("El volumen es %.2f \n",volumen);
		}
		else {
			System.out.println("La opcion no es correcta");
		}
		
	}
}
