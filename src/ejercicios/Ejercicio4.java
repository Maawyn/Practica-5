//Implementa una función que reciba un valor entero y devuelva la suma de los dígitos que lo
//componen.
package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String numUsuario;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numUsuario = sc.next();
		int solucion = Ejercicio4.suma(numUsuario);
		sc.close();
		System.out.println("El resultado es: "+ solucion);
		
	}
	public static int suma(String n){
		int resultado = 0;
		for(int i=0;i<n.length();i++){
			resultado += Integer.valueOf(String.valueOf(n.charAt(i)));
		}
		return resultado;
	}
}
