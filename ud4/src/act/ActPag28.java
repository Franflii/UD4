package act;

public class ActPag28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mayor(3,1);
	}

	static int mayor(int a, int b) {
		int mayor;
		
		if(a >= b) {
			mayor=a;
		}
		else {
			mayor=b;
		}
		return mayor;
	}
}
