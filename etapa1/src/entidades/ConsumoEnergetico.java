package entidades;

public class ConsumoEnergetico {

	public static ConsumoEnergetico DEFAULT = new ConsumoEnergetico("F");
	public static String[] CONSUMOS = {"A", "B", "C", "D", "E", "F"};
	
	private String clasificacion;

	ConsumoEnergetico(String clasificacion) {
		this.setClasificacion(clasificacion);
	}
	
	public double recargoConsumo() {
		switch (this.getClasificacion()) {
		case "A":
			return 100;
			
		case "B":
			return 80;
			
		case "C":
			return 60;
			
		case "D":
			return 50;
			
		case "E":
			return 30;
			
		case "F":
			return 10;
			
		default:
			return 10;
		}
	}
	
	
	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public int getIndex() {
		int index = 0;
		switch(this.clasificacion) {
			case "A": 
				index = 0;
				break;
			case "B": 
				index = 1;
				break;
			case "C": 
				index = 2;
				break;
			case "D": 
				index = 3;
				break;
			case "E": 
				index = 4;
				break;
			case "F": 
				index = 5;
				break;
		}
		
		return index;
	}
	
	public String toString() {
		return getClasificacion();
	}
	
}
