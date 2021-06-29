package model;
import java.util.ArrayList;

public class Promocion extends Producto{
	private ArrayList<Producto> contenidoPromo;
	
	public Promocion() {
		this.contenidoPromo = new ArrayList<Producto>();
	}
	
	public Promocion(String nombre, int precio, int stock) {
		super(nombre, precio, stock);
		this.contenidoPromo = new ArrayList<Producto>();
	}
	
	public void agregarAPromo(Producto p) {
		if(p!=null) {
			this.contenidoPromo.add(p);///producto cargado a la promo !
		}
	}
	

	public ArrayList<Producto> getContenidoPromoComplejo() {
		return this.contenidoPromo;
	}
	
	public String getContenidoPromo() {
		String listaDeProductos = "";
		for(int i = 0; i < this.contenidoPromo.size(); i++) {
			if(i == 0) {
				listaDeProductos = this.contenidoPromo.get(i).getNombre();
			}
			else {
				if(i + 1 < this.contenidoPromo.size()) {
					listaDeProductos = listaDeProductos +", "+ this.contenidoPromo.get(i).getNombre();
				}
				else {
					listaDeProductos = listaDeProductos +" y "+ this.contenidoPromo.get(i).getNombre()+".";
				}
			}
		}
		
		return listaDeProductos;
	}

	public void setContenidoPromo(ArrayList<Producto> contenidoPromo) {
		this.contenidoPromo = contenidoPromo;
	}

	@Override
	public String toString() {
		return ""+this.getNombre()+""
				+ "\nContenido de la promo: "+this.getContenidoPromo()
				+ "\nPrecio de la promo: "+this.getPrecio()
				+ "\nStock de la promo: "+this.getStock();
				
				
	}
	
}
