//Implementa una función que reciba tres parámetros que representen una fecha (día, mes y año)
//y compruebe si es una fecha válida. Ten en cuenta que abril, junio, septiembre y noviembre
//tienen 30 días y el resto de meses tienen 31, salvo febrero que tiene 28 (o 29 si es año bisiesto).

package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int year,month,day;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un año");
		year = sc.nextInt();
		System.out.println("Introduzca un mes");
		month = sc.nextInt();
		System.out.println("Introduzca un dia");
		day = sc.nextInt();
		sc.close();
		System.out.println(DateIsCorrect(year, month, day));
	}

	private static boolean DateIsCorrect(int year,int month,int day){
		if(YearIsCorrect(year) == false){
			return false;
		}
		boolean isBisiesto = YearBisiesto(year);
		if(MonthIsCorrect(month) == false){
			return false;
		}
		int numOfDaysOnMonth = Calendario(month,isBisiesto);
		if(DayIsCorrect(day,numOfDaysOnMonth) == false){
			return false;
		}
		return true;
	}
	private static boolean YearIsCorrect(int year){
		if(year <= 0){
			return false;
		}
		return true;
	}
		
	private static boolean YearBisiesto(int year){
		return (year%4==0);
	}
	private static boolean MonthIsCorrect(int month){
		if(month > 12 || month < 1){
			return false;
		}
			return true;
	}
	private static boolean DayIsCorrect(int day,int numOfDaysOnMonth){
		if(day > numOfDaysOnMonth || day <=0){
			return false;
		}
			return true;
		
	}
	private static int Calendario(int month, boolean isBisiesto){
		int numberOfDaysOnMonth = 0;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numberOfDaysOnMonth = 31;
			break;
		case 4: case 6: case 9: case 11:
			numberOfDaysOnMonth = 30;
			break;                                                                       
		case 2:
			if(isBisiesto = true){
				numberOfDaysOnMonth = 29;
			}else {
				numberOfDaysOnMonth = 28;
			}
			break;
	}	
	return numberOfDaysOnMonth;
	}
}
	