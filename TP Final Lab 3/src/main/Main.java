package main;
import model.Empanada;
import model.Pizza;
import model.Producto;
import model.Promocion;

//Main Main Main Main
public class Main {

	public static void main(String[] args) {
		
		Producto pizzaNapo = new Pizza("Pizza Napolitana", 200, 200);
		Producto pizzaFugazza = new Pizza("Pizza Fugazetta", 300, 150);
		Producto empanadaDeCarne = new Empanada("Empanada de Carne", 60, 100, true);
		
		//System.out.println(pizzaNapo);
		
		Promocion promo1 = new Promocion("Promo 1", 500, 20);
		
		promo1.agregarAPromo(pizzaNapo);
		promo1.agregarAPromo(pizzaFugazza);;
		promo1.agregarAPromo(empanadaDeCarne);;
		
		System.out.println(promo1);
		
		
		
		System.out.println("Funciona GIT");
	}

}
