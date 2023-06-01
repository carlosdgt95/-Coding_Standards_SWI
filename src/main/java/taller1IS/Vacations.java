package taller1IS;

import java.util.Scanner;

public class Vacations {
    String destination;
    int numTravelers;
    int duration;
    int base;
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
    public Vacations(String destination, int numTravelers, int duration){
	super();
	this.destination = destination;
	this.numTravelers = numTravelers;
	this.duration = duration;
    }
    
    /**
   	 * 
   	 * @return
   	 */
    public void setDestination(String destination){
        this.destination = destination;
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

    public void setNumTravelers(int numTravelers) {
        this.numTravelers = numTravelers;
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

    public void setDuration(int duration) {
        this.duration = duration;
    }
	 /**
   	 * 
   	 * @return
   	 */
    public int getBase() {
        return base;
    }
	 /**
   	 * 
   	 * @return
   	 */
    public void setBase(int base) {
        this.base = base;
    }
	 /**
   	 * 
   	 * @return
   	 */

    public static int calculate(Vacations vacacion) {

        int base = 1000;

        if (vacacion.getDestination().equals("Paris")) {
            return base + 500;

        } else if (vacacion.getDestination().equals("New York City")) {
            return base + 600;

        } else if ((vacacion.getNumTravelers() >= 4) && (vacacion.getNumTravelers() < 10)) {
            return (int) (base * 0.10);

        } else if (vacacion.getNumTravelers() > 10) {
            return (int) (base * 0.20);

        } else if (vacacion.getDuration() < 7) {
            return base + 200;

        } else if (vacacion.getDuration() > 30 || vacacion.getNumTravelers() == 2) {
            return base - 200;

        } else if (vacacion.getNumTravelers() > 80)
            System.out.println("No est� disponible el servicio para tantas personas. ");
        return -1;
    }

	// CHECKSTYLE:OFF
	public static void main(String[] args) {
		// CHECKSTYLE:ON
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el n�mero de pasajeros: ");
        int travelers = sc.nextInt();

        System.out.println("Ingrese el destino: ");
        String destination = sc.next();

        System.out.println("Ingrese la duraci�n del viaje: ");
        int duration = sc.nextInt();

        Vacations vacaciones = new Vacations(destination, travelers, duration);

        System.out.println("Valor a pagar " + calculate(vacaciones));
    }

}
