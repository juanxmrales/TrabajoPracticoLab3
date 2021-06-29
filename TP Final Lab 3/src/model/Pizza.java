import java.util.ArrayList;
import java.util.Scanner;

public class Pizza extends Producto{
	private String nombre;
	private ArrayList<String> ingredientes;/// me parece mejor crear un arraylist para poder contabilizar los ingredientes.
	
	public Pizza(String nombre, int precio, int stock) {///Este constuctor crea la lista y toma por paramentro el nombre, stock y precio del mismo.
		super(nombre, precio, stock);
		Scanner scan = new Scanner(System.in);
		this.ingredientes = new ArrayList<String>();
		char opcion = 0;
		System.out.println("Creador de pizzas :");
		while(opcion != 'n') {
			System.out.println("\nIngrese un ingrediente: ");
			this.ingredientes.add(scan.next());
			System.out.println("\nDesea seguir cargando ingredientes? (ingrese la tecla 'n' para salir): ");
			opcion = scan.next().charAt(0);
		}
		System.out.println("Pizza creada !");
	}
	
	public Pizza(ArrayList<String> listaDeIngredientes, String nombre) {///Este constructor recibe por parametro un ArrayList de ingredientes previamente hecho.
		this.nombre = nombre;
		this.ingredientes = listaDeIngredientes;
	}
	
	public void agregarIngrediente(String ingrediente){
		this.ingredientes.add(ingrediente);
	}

	public void mostrarIngredientes() {///un getIngredientes pero mas sin retorno.
		System.out.println("Pizza "+this.getNombre()+": ");
		for(int i = 0;i < this.ingredientes.size();i++) {
			System.out.println(this.ingredientes.get(i));;
		}
	}
	
	
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override/// ToString generico !
	public String toString() {
		return "Pizza "+this.getNombre()+"\nIngredientes: " + getIngredientes() + "\nPrecio: "
				+ getPrecio() + "\nStock: " + getStock();
	}
	
	
	
}
