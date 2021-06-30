package productos;
import java.util.ArrayList;
import java.util.Scanner;

public class Pizza extends Producto
{
	
	private ArrayList<String> ingredientes;/// me parece mejor crear un arraylist para poder contabilizar los ingredientes.
	
	public Pizza() 
	{
		ingredientes = new ArrayList<>();
	}
	
	public Pizza(String nombre, float precio, int stock) {///Este constructor recibe por parametro un ArrayList de ingredientes previamente hecho.
		super(nombre,precio,stock);
		ingredientes = new ArrayList<>();		
	}
	
	public void agregarIngrediente(String ingrediente)
	{
		ingredientes.add(ingrediente);
	}
	
	public ArrayList<String> getIngredientes()
	{
		return ingredientes;
	}
	
	public String listarIngredientes() 
	{
		String listado ="";
		for(int i = 0;i < ingredientes.size();i++) 
		{
			listado = listado + ingredientes.get(i);
		}
		return listado;
	}

	@Override
	public String toString() 
	{
		return super.toString() +  "Pizza [ingredientes=" + listarIngredientes() + "]";
	}

	

	
	
	
}
