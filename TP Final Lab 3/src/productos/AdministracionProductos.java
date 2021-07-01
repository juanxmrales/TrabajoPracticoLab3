package productos;

import java.util.Scanner;

public class AdministracionProductos
{
	
	Scanner scan = new Scanner(System.in);

	public Pizza crearPizza () 
	{
		
		char opcion = 0;
		Pizza aux = new Pizza();
		System.out.println("Creador de pizzas :");
		
		System.out.println("Ingrese el nombre de la pizza");
		aux.setNombre(scan.next());
		System.out.println("Ingrese el precio");
		aux.setPrecio(scan.nextFloat());
		System.out.println("Ingrese el stock disponible");
		aux.setStock(scan.nextInt());
		
		while(opcion != 'n')
		{
			System.out.println("\nIngrese un ingrediente: ");
			aux.agregarIngrediente(scan.next());
			System.out.println("\nDesea seguir cargando ingredientes? (ingrese la tecla 'n' para salir): ");
			opcion = scan.next().charAt(0);
		}
		System.out.println("Pizza creada !");
		return aux;
	}
	
	
}
