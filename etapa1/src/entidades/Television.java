package entidades;

public class Television extends Electrodomestico {
	
	public static double RESOLUCIONDEFAULT = 20;
	public static boolean TDTDEFAULT = false;
	public static double AUMENTOTDT = 50;
	public static double PORCENTAJERESOLUCIONMAYOR = 0.3;
	public static double RESOLUCIONAUMENTOPRECIO = 40;
	
	private double resolucion;
	private boolean tdt;
	
	public Television() {
		super();
		this.setResolucion(RESOLUCIONDEFAULT);
		this.setTdt(TDTDEFAULT);
	}
	
	public Television(double precio, double peso) {
		super(precio, peso);
		this.setResolucion(RESOLUCIONDEFAULT);
		this.setTdt(TDTDEFAULT);
	}
	
	public Television(double precio, double peso, String color, String consumo, double resolucion, boolean tdt) {
		super(precio, peso, color, consumo);
		this.setResolucion(resolucion);
		this.setTdt(tdt);
	}
	
	public Television(double precio, double peso, String color, String consumo, double resolucion, boolean tdt, String descripcion) {
		super(precio, peso, color, consumo);
		this.setResolucion(resolucion);
		this.setTdt(tdt);
		this.setDescripcion(descripcion);
	}
	
	public double precioFinal() {
		double precioParcial = super.precioFinal();
		
		if(getResolucion() > RESOLUCIONAUMENTOPRECIO) {
			precioParcial += precioParcial * PORCENTAJERESOLUCIONMAYOR;
		}
		
		if(getTdt()) {
			precioParcial += AUMENTOTDT;
		}
		
		return precioParcial;
	}
	
	public double getResolucion() {
		return resolucion;
	}
	
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	
	public boolean getTdt() {
		return tdt;
	}
	
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	public String toString() {
		String str = "Television " + this.getDescripcion() + " | $" + this.precioFinal() + " | Resolucion: " + this.getResolucion();
		str += this.getTdt() ? " | TDT: Si" : " | TDT: No";
		str += " | Peso: " + this.getPeso() + "kg | " + this.getColor() + " | Consumo: " + this.getConsumo();
		
		return str;
	}
	
}
