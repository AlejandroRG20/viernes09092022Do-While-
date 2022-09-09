package estructurapostprueba;
import java.util.Scanner;
public class EstructuraDoWhile {

	public static void main(String[] args) {
		// Estructuras repetitivas
		// -Estructuras preprueba
		// --Estructura while
		// -Estructura post prueba
		// ---Estructura Do...While
		int num;
		Scanner n=new Scanner(System.in);
		
		System.out.println("Digite un numero entre 1 y 10");
		num = n.nextInt();
		
		while (num<5) {
			num++; //para que el while o do while no sea infinito el num tiene que cambiar
			       // ya sea num *= 5   num * 5
			       //        num /=8    num / 8
			System.out.println("num = "+ num);
			
		}
		//con el while
		do {
			num++;
			System.out.println("num = "+ num);
			
		} while (num<10);
		
       System.out.println("Fin del programa");
	}

}
