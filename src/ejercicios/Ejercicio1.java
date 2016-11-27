package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numUsuario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un numero: ");
		numUsuario = sc.nextInt();
		
		Ejercicio1.parimpar(numUsuario); //llama al metodo parimpar (que tiene que devolver un booleano)
		sc.close();
	}

	public static boolean parimpar(int num){// recoge un int que hemos dicho que sea numUsuario, y se le cambia el nombre por num	
		return (num%2==0); //condicion para que el booleano sea true, es decir hay que poner que sea par
	}
}
