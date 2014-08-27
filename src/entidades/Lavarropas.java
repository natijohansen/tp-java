package entidades;

public class Lavarropas extends Electrodomestico {

	public static double CARGADEFAULT = 5;
	
	private double carga;
	
	public Lavarropas() { 
		super();
		this.setCarga(CARGADEFAULT);
	}
	
	public Lavarropas(double precio, double peso) { 
		super(precio, peso);
		this.setCarga(CARGADEFAULT);
	}
	
	public Lavarropas(double precio, double peso, String color, String consumo, double carga) {
		super(precio, peso, color, consumo);
		this.setCarga(carga);
	}
	
	public Lavarropas(double precio, double peso, String color, String consumo, double carga, String descripcion) {
		super(precio, peso, color, consumo);
		this.setCarga(carga);
		this.setDescripcion(descripcion);
	}
	
	public double precioFinal() { 
		if(this.getCarga() > 30) {
			return super.precioFinal() + 50;
		}
		else {
			return super.precioFinal();
		}
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
}
