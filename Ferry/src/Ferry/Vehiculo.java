/* Se quiere implementar el control de un Ferry. 
 * 
 * Para ello cree una clase Vehículo.
 * 
 * Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia 
 * o ausencia de tripulación, número de ruedas, fecha de matriculación,medio por el 
 * que se desplaza, etc. 
 * 
 * Incluya los métodos que considere oportunos.
 * 
 * Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste acontinuación por pantalla
 */

package Ferry;

public class Vehiculo {
	
	String brand;
	String model;
	String type;
	int pasengers;
	int weels;
	
	public Vehiculo() {}
	
	public Vehiculo(String brand, String model, String type, int pasengers, int weels) {
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.pasengers = pasengers;
		this.weels = weels;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [brand=" + brand + ", model=" + model + ", type=" + type + ", pasengers=" + pasengers
				+ ", weels=" + weels + "]";
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getPasengers() {
		return pasengers;
	}
	
	public void setPasengers(int pasengers) {
		this.pasengers = pasengers;
	}
	
	public int getWeels() {
		return weels;
	}
	
	public void setWeels(int weels) {
		this.weels = weels;
	}

}
