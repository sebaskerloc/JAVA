import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  in = new Scanner(System.in);
		System.out.println("Escribe la cantidad de la venta, para calcular tu comisión:");
		long venta = in.nextLong();
		double comision = 0.0;
		if(venta < 1000) {
	    	  System.out.println("No tiene comisión");
	      }else if(venta>=1000 && venta<5000) {
	    	comision = venta * .10; 
	    	System.out.print("Su comisión calculada es: ");
	    	System.out.print(comision);
	    	  
	      }else if(venta>=5000 && venta<10000) {
	    	  comision = venta * .20; 
	    	  System.out.print("Su comisión calculada es: ");
	    	  System.out.print(comision);
	      }else if(venta >= 10000) {
	    	  comision = venta * .30; 
	    	  System.out.print("Su comisión calculada es: ");
	    	  System.out.print(comision);
	      }else {
	    	  System.out.print("Ingrese un entero positivo por favor");
	      }//if else
	     

	}
}
