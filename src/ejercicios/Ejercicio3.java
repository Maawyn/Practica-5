package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numUsuario;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		numUsuario = sc.nextInt();
		int solucion = Ejercicio3.factorial(numUsuario);
		sc.close();
		System.out.println("El resultado es: "+ solucion);
		
	}
	public static int factorial(int n){
		int resultado = 0;
		for(int i=1;i<=n;i++){
			resultado *=  i;
		}
		return resultado;
	}
}