package logica;

public class Parcial {
	
	public double []calcularRaices (int a, int b, int c)  throws IllegalArgumentException{
		
		if (a == 0) {
			throw new IllegalArgumentException("El valor de a no puede ser igual a 0.");
		} 
			
		int discriminante = (b*b) - (4*a*c);
		
		if (discriminante < 0) {
			throw new IllegalArgumentException ("La ecuacion tiene discriminante negativo, por tanto raices imaginarias");
			
		}
		
		double raiz1 = (-b + Math.sqrt(discriminante)) / (2*a);
		double raiz2 = (-b - Math.sqrt(discriminante)) / (2*a);
		
		return new double[] {raiz1, raiz2};
		
	}

}
