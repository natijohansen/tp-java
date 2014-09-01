package datos;

import entidades.Electrodomestico;
import entidades.Television;
import entidades.Lavarropas;

public class GeneradorElectrodomesticos {
	
	private static String[] marcasLavarropas = {"Drean", "Whirlpool", "Consul", "Eslabon de Lujo", 
												"Ken Brown", "LG", "Samsung", "Philco"};
	
	private static String[] marcasTelevision = {"Ken Brown", "Phillips", "Sony", "Noblex", "LG", 
												"Samsung", "Philco", "Hitachi"};
	
	private static String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
	
	private static String[] consumos = {"A", "B", "C", "D", "E", "F"};
	
	public static Electrodomestico generar(String tipo) {
		
		double precio = Math.round(Math.random()*500) + 500;
		double peso = Math.round(Math.random()*30) + 10;
		int color = (int) Math.floor(Math.random()*5);
		int consumo = (int) Math.floor(Math.random()*6);
		
		Electrodomestico e;
		
		if(tipo.equalsIgnoreCase("television")) {
			int marca = (int) Math.floor(Math.random() *marcasTelevision.length);
			boolean tdt = Math.random() > 0.5 ? true : false;
			double resolucion = Math.round(Math.random()*40) + 10;

			e = new Television(precio, peso, colores[color], consumos[consumo], resolucion, tdt, marcasTelevision[marca]);
		}
		
		else {
			int marca = (int) Math.floor(Math.random() * marcasLavarropas.length);
			double carga = Math.round(Math.random()*9) + 3;
			e = new Lavarropas(precio, peso, colores[color], consumos[consumo], carga, marcasLavarropas[marca]);
		}		
		
		return e;
	}
}
