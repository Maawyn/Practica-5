//Implementa un procedimiento que reciba los coeficientes de una ecuación de segundo grado e
//imprima por pantalla las raíces obtenidas al resolver la ecuación

package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double coef1,coef2,t;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los coeficientes en orden terminando por el termino independiente");
		coef1 = sc.nextInt();
		coef2 = sc.nextInt();
		t = sc.nextInt();
		sc.close();
		Ejercicio5.ecuacion(coef1,coef2,t);		
	}
	
	public static double ecuacion (double c1,double c2,double t){
		double resultado;
		// double potencia = Math.pow(2, c2); 
		double raiz = Math.sqrt(((int)c2^2)-(4 * c1 * t));
		resultado = (-c2 + raiz) / (2*c1);
		return resultado;
		
	}
}
