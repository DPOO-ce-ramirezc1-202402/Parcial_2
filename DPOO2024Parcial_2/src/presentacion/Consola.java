package presentacion;

import logica.Parcial;

public class Consola {

	public static void main(String[] args) {
		
		Parcial ec = new Parcial();
		
		try {
			double [] raices = ec.calcularRaices(1, -3, 2);
			System.out.println("Raiz 1 = " + raices[0]);
			System.out.println("Raiz 2 = " + raices[1]);
		} catch (IllegalArgumentException e){
			System.out.println("Error: " + e.getMessage());
			
		}
	}
	
	
}
