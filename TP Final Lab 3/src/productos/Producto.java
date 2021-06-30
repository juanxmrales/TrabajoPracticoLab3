package productos;

public class Producto {
	private String nombre;
	private float precio; /// cambio de int a float para que el programa pueda aceptar numeros con coma
	private int stock;
	
	public Producto() {
		
	}
	
	public Producto(String nombre, float precio, int stock) {
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
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
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
