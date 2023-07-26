import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		System.out.println("Escribe tu edad por favor: ");
		int edad = in.nextInt();
		float costo = 0.0F;
		if(edad>0 && edad < 5) {
			costo = (float) (7 - (7 * .60)); 
			
	    	System.out.print("El costo del boleto en Euros es: ");
	    	System.out.print(costo);
	      }else if(edad>=5 && edad<60) {
	    
	    		System.out.print("El costo del boleto en Euros es: 7");
	    
	    	  
	      }else if(edad > 60 && edad<200) {
	    	  costo = (float) (7 - (7 * .55));
	    	  System.out.print("El costo del boleto en Euros es: ");
		    	System.out.print(costo);
	    	
	      }else {
	    	  
	    	  System.out.print("Ingrese una edad correcta por favor");
	      }//if-else
	     

	}//main

}
