package entidades;

public class Color {
	
	public static Color DEFAULT = new Color("blanco");
	public static String[] COLORES = { "blanco", "negro", "rojo", "azul", "gris" };
	
	private String nombre;

	Color(String nombre) {
		this.setNombre(nombre);
	}
	
	public String toString() {
		return getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getIndex() {
		int index = 0;
		switch(this.nombre) {
			case "blanco": 
				index = 0;
				break;
			case "negro": 
				index = 1;
				break;
			case "rojo": 
				index = 2;
				break;
			case "azul": 
				index = 3;
				break;
			case "gris": 
				index = 4;
				break;
		}
		
		return index;
	}
	
}
