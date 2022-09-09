package estructurapostprueba;
import java.util.*;

public class TablasDeMultiplicar {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
	      int num;
	      
	      System.out.println("Que tabla desa que le muestre");
	      num = n.nextInt();
	      
	      for (int i = 1; i<13; i++) {
	    	  
			System.out.println(num +" x " + i + " = "+ (num*i));
			
		}
	
		
		
		
	}

}
