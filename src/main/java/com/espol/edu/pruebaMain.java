package com.espol.edu;

import java.util.Scanner;

public class pruebaMain {
	private String destination;
	private int numTravelers;
	private int duration;
	public int base;
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumTravelers() {
		return numTravelers;
	}
	public void setNumTravelers(int numTravelers) {
		this.numTravelers = numTravelers;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public pruebaMain(String destination, int numTravelers, int duration) {
		super();
		this.destination = destination;
		this.numTravelers = numTravelers;
		this.duration = duration;
	}
	public static int calculate(pruebaMain Person) {

		int base = 1000;

		if (Person.getDestination().equals("Paris")) {
			return base + 500;

		
		}else if (Person.getDestination().equals("New York City")) {
			return base + 600;

		}else if ((Person.getNumTravelers() >= 4) && (Person.getNumTravelers() < 10)) {
			return (int) (base * 0.10);

		}else if (Person.getNumTravelers() > 10) {
			return (int) (base * 0.20);

		}else if (Person.getDuration() < 7) {
			return base + 200;

		}else if (Person.getDuration() > 30 || Person.getNumTravelers() == 2) {
			return base - 200;

		}else if (Person.getNumTravelers() > 80)
			System.out.println("No est� disponible el servicio para tantas personas. ");
		return -1;

	}
    //CHECKSTYLE:OFF
	public static void main(String[] args) {
    //CHECKSTYLE:ON
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el n�mero de pasajeros: ");
		int travelers = sc.nextInt();

		System.out.println("Ingrese el destino: ");
		String destination = sc.next();

		System.out.println("Ingrese la duraci�n del viaje: ");
		int duration = sc.nextInt();

		pruebaMain person = new pruebaMain(destination, travelers, duration);

		System.out.println("Valor a pagar " + calculate(person));
	}
}
