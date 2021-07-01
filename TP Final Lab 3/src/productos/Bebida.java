package productos;

public class Bebida extends Producto
{
	private float cc; //centimetros cubicos

	public Bebida() {
		
	}

	public Bebida(String nombre, float precio, int stock,float cc) {
		super(nombre, precio, stock);
		this.cc= cc;		
	}

	public float getCc() {
		return cc;
	}

	public void setCc(float cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return super.toString() + "Bebida [cc=" + cc + "]";
	}
	
	
	
	
	

}
