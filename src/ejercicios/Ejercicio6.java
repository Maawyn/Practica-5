package ejercicios;

import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int numUsuario;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un año");
		numUsuario = sc.nextInt();
		
		boolean si = Ejercicio6.esBisiesto(numUsuario);
		System.out.println("¿Es este año bisiesto? "+ si);
	}
	
	private static boolean esBisiesto (int num){
		return (num%4==0);
	}
}
