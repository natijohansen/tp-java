package entidades;

public class Electrodomestico {
	
	// precio base, color, consumo energetico y peso

	public static double PRECIODEFAULT = 100;
	public static double PESODEFAULT = 5;
	
	private double precioBase;
	private double peso;
	private Color color;
	private ConsumoEnergetico consumo;
	private String descripcion;
	
	
	Electrodomestico() {
		this.setPrecioBase(PRECIODEFAULT);
		this.setPeso(PESODEFAULT);
		this.setConsumo(ConsumoEnergetico.DEFAULT);
		this.setColor(Color.DEFAULT);	
	}
	
	Electrodomestico(double precio, double peso) {
		this.setPrecioBase(precio);
		this.setPeso(peso);
		this.setConsumo(ConsumoEnergetico.DEFAULT);
		this.setColor(Color.DEFAULT);	
	}
	
	Electrodomestico(double precio, double peso, String color, String consumo) {
		this.setPrecioBase(precio);
		this.setPeso(peso);
		
		if(comprobarConsumoEnergetico(consumo)) {
			this.setConsumo(new ConsumoEnergetico(consumo));
		}
		else {
			this.setConsumo(ConsumoEnergetico.DEFAULT);
		}
		
		if(comprobarColor(color)) {
			this.setColor(new Color(color));
		}
		else {
			this.setColor(Color.DEFAULT);
		}
		System.out.println(getColor());
		
	}
	
	private boolean comprobarConsumoEnergetico(String letra) {
		boolean flag = false;
		for(String consumo : ConsumoEnergetico.CONSUMOS) {
			if(letra.equals(consumo)) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	
	private boolean comprobarColor(String color) {
		boolean flag = false;
		for(int i=0; i < Color.COLORES.length; i++) {
			if(color.equals(Color.COLORES[i])) {
				flag = true;
				break;
			}
		}
		
		return flag;		
	}
	
	public double precioFinal() {
		return this.getPrecioBase() + this.recargoPeso() + this.getConsumo().recargoConsumo();
	}
	
	private double recargoPeso() {
		if(this.getPeso() > 80) {
			return 100;
		}
		else if(this.getPeso() <= 79 && this.getPeso() >= 50) {
			return 80;
		}
		else if(this.getPeso() <= 49 && this.getPeso() >= 20) {
			return 50;
		}
		else {
			return 10;
		}
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public ConsumoEnergetico getConsumo() {
		return consumo;
	}
	
	public void setConsumo(ConsumoEnergetico consumo) {
		this.consumo = consumo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
