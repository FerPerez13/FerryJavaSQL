package Ferry;

import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Scanner;

import Ferry.Vehiculo;

public class main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	public static void main(String[] args) {
		
		System.out.println("************************************");
		System.out.println("*******                      *******");
		System.out.println("******* Administración Ferry *******");
		System.out.println("*******                      *******");
		System.out.println("************************************");
		
		int option = menu();
		while(option != 0) {
			switch (option) {
			case 1:
				newVehicle(vehiculos);
				break;
			case 2:
				modifyVehicle(vehiculos);
				break;
			case 3:
				deleteVehicle(vehiculos);
				break;
			case 4:
				listVehicle(vehiculos);
			default:
				System.err.println("Entrada no valida. Seleccione otra opción");
				break;
			}
			option = menu();
		}
	}
	
	private static void newVehicle(ArrayList<Vehiculo> vehiculos) {
		scanner.nextLine();
		System.out.println(" --- Nuevo vehículo --- ");
		System.out.println();
		System.out.println("Marca del vehículo:");
		String brand = scanner.nextLine();
		System.out.println();
		System.out.println("Modelo del vehículo:");
		String model = scanner.nextLine();
		System.out.println();
		System.out.println("Tipo de vehículo:");
		String type = scanner.nextLine();
		System.out.println();
		System.out.println("Número de pasajeros:");
		int pasengers = scanner.nextInt();
		System.out.println();
		System.out.println("Número de ruedas:");
		int weels = scanner.nextInt();
		
		Vehiculo vehiculo = new Vehiculo(brand, model, type, pasengers, weels);
		vehiculos.add(vehiculo);
	}
	
	private static void modifyVehicle(ArrayList<Vehiculo> vehiculos) {
		System.out.println(" --- Modificar vehículos --- ");
		
	}
	
	private static void deleteVehicle(ArrayList<Vehiculo> vehiculos) {
		System.out.println(" --- Eliminar vehículos --- ");
		
	}
	
	private static void listVehicle(ArrayList<Vehiculo> vehiculos) {
		System.out.println(" --- Listar vehículos --- ");
		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.toString();
		}
		
	}

	public static int menu() {
		int option = 0;
		System.out.println();		
		System.out.println("####################################");
		System.out.println("##   1. Nueva entrada             ##");
		System.out.println("##   2. Modificar entrada         ##");
		System.out.println("##   3. Eliminar entrada          ##");
		System.out.println("##   4. Ver todas las entradas    ##");
		System.out.println("##   0. Salir                     ##");
		System.out.println("####################################");
		System.out.println();
		System.out.println("Seleccione una opción:");
		option = scanner.nextInt();
		return option;
	}

}
