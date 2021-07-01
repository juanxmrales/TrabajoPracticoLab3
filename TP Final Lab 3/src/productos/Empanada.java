package productos;

public class Empanada extends Producto{
	private boolean frita;// si es true es frita y es false si es al horno.
	
	public Empanada() {
		
	}
	
	public Empanada(String nombre, int precio, int stock, boolean esFrita) {
		super(nombre, precio, stock);
		this.frita = esFrita;
	}
	
	

	public boolean isFrita() {
		return frita;
	}

	public void setFrita(boolean frita) {
		this.frita = frita;
	}

	@Override
	public String toString() {
		return super.toString() + "Empanada [frita=" + frita + "]";
	}

	
	
	
	
}
