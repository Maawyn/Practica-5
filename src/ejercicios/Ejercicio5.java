//Implementa un procedimiento que reciba los coeficientes de una ecuación de segundo grado e
//imprima por pantalla las raíces obtenidas al resolver la ecuación.

package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int a, b, t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los coeficientes en orden acabado en el termino independiente");
		a = sc.nextInt();
		b = sc.nextInt();
		t = sc.nextInt();
		
		double raiz = raiz(a,b,t);
		double denominador = 2 * a;
		double primerResultado = ecuacionPositiva(b, raiz, denominador);
		double segundoResultado = ecuacionNegativa(b, raiz, denominador);
		System.out.println("x1 = " + primerResultado);
		System.out.println("x2 = " + segundoResultado);
		
	}
	private static double raiz(int a, int b, int t){
		
		return Math.sqrt(Math.pow(b, 2) - 4 * a * t);
	}
	
	private static double ecuacionNegativa(int b, double raiz, double denominador){
	 return (-b - (raiz))/ denominador;
	}
	
	private static double ecuacionPositiva(int b, double raiz, double denominador){
		return (-b + (raiz))/ denominador;
	}
}
