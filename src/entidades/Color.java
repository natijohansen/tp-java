package entidades;

public class Color {
	
	public static Color DEFAULT = new Color("blanco");
	public static String[] COLORES = {"blanco", "negro", "rojo", "azul", "gris"};

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
	
}
