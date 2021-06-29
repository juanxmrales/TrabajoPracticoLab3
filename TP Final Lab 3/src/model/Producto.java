package model;

public class Producto {
	private String nombre;
	private int precio;///Pongo int porque hoy en dia los precios son enteros.
	private int stock;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, int precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto: \nNombre: " + getNombre() + ", \nPrecio: " + getPrecio() + ", \nStock: " + getStock()
				+ "";
	}
	
}
