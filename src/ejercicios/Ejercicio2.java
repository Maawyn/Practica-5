package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		float num1, num2;
		char operacion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los valores que quiere utilizar: ");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		System.out.println("Introduzca la operacion que quiera realizar teniendo en cuenta");
		System.out.println("m para multiplicar");
		System.out.println("s para  sumar");
		System.out.println("d para dividir");
		operacion = sc.next().charAt(0);
		sc.close();
		
		float resultado = Ejercicio2.operar(num1, num2, operacion);
		System.out.println("El reslutado de su operación es: " + resultado);
	
	}
	
	public static float operar(float n1,float n2,char operacion){
		float resultado = 0;
		if(operacion == 's'){
			resultado = n1 + n2;
		}
		if(operacion == 'm'){
			resultado = n1 * n2;
			
		}
		if(operacion == 'd'){
			resultado = n1 / n2;
		}
		return resultado;
	}

}