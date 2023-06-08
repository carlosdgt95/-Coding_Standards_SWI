package taller1is;

import java.util.Scanner;
/**
 * 
 * @return
 */
public class Vacations {
	/**
	 * 
	 * @return
	 */ 
	/* default */ final String destination;
 /**
	 * 
	 * @return
	 */ 
	/* default */ final int numTravelers;

	/**
	 * 
	 * @return
	 */ 
	/* default */ final int duration;

	/**
	 * 
	 * @return
	 */
    public String getDestination(){
        return destination;
    
    }
    /**
	 * 
	 * @return
	 */
    public Vacations(final String destination, final int numTravelers, final int duration){
	super();
	this.destination = destination;
	this.numTravelers = numTravelers;
	this.duration = duration;
    }
    
 
    /**
   	 * 
   	 * @return
   	 */
    public int getNumTravelers() {
        return numTravelers;
    }

    /**
   	 * 
   	 * @return
   	 */
    public int getDuration() {
        return duration;
    }
	 /**
   	 * 
   	 * @return
   	 */

    public static int calculate(final Vacations vacacion) {
    	final  int maxvalue = 10;
    	final  int maxvalue1 = 80;
        final  int minvalues = 7;
        final int base = 1000;
        final String paris="Paris";
        final String newCity="New York City";
        if (vacacion.getDestination().equals(paris)) {
            return base + 500;
        } else if (vacacion.getDestination().equals(newCity)) {
            return base + 600;

        } else if ((vacacion.getNumTravelers() >= 4) && (vacacion.getNumTravelers() < 10)) {
            return (int) (base * 0.10);

        } else if (vacacion.getNumTravelers() >maxvalue) {
            return (int) (base * 0.20);

        } else if (vacacion.getDuration() < minvalues) {
            return base + 200;

        } else if (vacacion.getDuration() > 30 || vacacion.getNumTravelers() == 2) {
            return base - 200;

        } else if (vacacion.getNumTravelers() > maxvalue1) {
            System.out.println("No esta disponible el servicio para tantas personas. ");
                
            
        }
        return -1;
    }

    /**
    *
    *
    * @author C
    */
    public static void main(String[] args) {
		// CHECKSTYLE:ON

        final Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese el numero de pasajeros: ");
        final int travelers = scaner.nextInt();
        System.out.println("Ingrese el destino: ");
        final String destination = scaner.next();

        System.out.println("Ingrese la duracion del viaje: ");
        final int duration = scaner.nextInt();
       
        final Vacations vacaciones = new Vacations(destination, travelers, duration);
        
        System.out.println("Valor a pagar " + calculate(vacaciones));
        scaner.close();
    }

}
