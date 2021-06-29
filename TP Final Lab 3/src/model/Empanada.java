package model;

public class Empanada extends Producto{
	private boolean frita;// si es true es frita y es false si es al horno.
	
	public Empanada() {
		
	}
	
	public Empanada(String nombre, int precio, int stock, boolean esFrita) {
		super(nombre, precio, stock);
		this.frita = esFrita;
	}
	
	public String esFritaString() {
		if(this.isFrita() == true) {
			return "Frita";
		}
		else {
			return "Al horno";
		}
	}
	
	
	public boolean isFrita() {
		return frita;
	}

	public void setFrita(boolean frita) {
		this.frita = frita;
	}

	@Override
	public String toString() {
		return getClass().getName() + " {\n\tesFritaString: " + esFritaString() + "\n\tgetNombre: " + getNombre()
				+ "\n\tgetPrecio: " + getPrecio() + "\n\tgetStock: " + getStock() + "\n\ttoString: " + super.toString()
				+ "\n}";
	}
	
	
}
