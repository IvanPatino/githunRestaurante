package Ui;

import Models.Client;
import Models.Table;
import Models.Recipe;
import Models.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" **** BIENVENIDOS A SU RESTAURANTE EL GRAN SAZON ******");
		
		
		System.out.println (" ");
		
		
		Client newClient = new Client("Andres", "rojas", "123456789", true);
		Client newClient1 = new Client("Camila", "Castillo", "1110789521", false);
		Client newClient2 = new Client("Carlos", "Lopez", "1105684256", true);
		
		Recipe newRecipe =  new Recipe (" Arroz paisa vegetariano ", 20000);
		Recipe newRecipe1 = new Recipe (" Filete de róbalo con vinagreta cremosa de hierbas", 12000);
		Recipe newRecipe2 = new Recipe (" Pollo con verduras chinas ", 25000);
		
		Table newTable = new Table (" 1", 4 , "lado izquiero de la entrada ");
		Table newTable1 = new Table (" 3 ",  2 , "lado derecho de la ventana ");
		Table newTable2 = new Table (" 5 ", 6 ,"centro del restaurante");
		
		Product newProduct = new Product ("Arroz", "boluga", 5,2000);
		Product newProduct1 = new Product ("Atun","vamcamps",3, 7500);
		Product newProduct2 = new Product ("aceite", "diana",2, 24000);
		
		
		
		
		System.out.println(" !!! Cliente N-1 !!! ");
		
		newClient.setName("Camilo");
		newClient.setLastname("Diaz");
		newClient.setHasChildrens(false);
		newRecipe.setName("Bandeja Paisa");
		newRecipe.setPrice(20000);
		newTable.setUbication("Entrada del restaurante");
		System.out.println("El nuevo cliente es : " + newClient.getName()+ " " + newClient.getLastname()  + " " + "¿tiene hijos?"+ " " + newClient.isHasChildrens());
		System.out.println("Ubicado en la mesa: " + newTable.getNumber() + " " +  "Capacidad: " + newTable.getCapacity() + " " + "Ubicacion:" + newTable.getUbication());
		System.out.println("Nombre de la receta nueva : " + newRecipe.getName() + " " + "Precio:" + newRecipe.getPrice());		
		
		System.out.println (" ");
		
		System.out.println( "*** Cliente N-2 *** ");
		
		
		newClient1.setName("Juana");
		newTable1.setCapacity(8);
		newProduct1.setName("Pollo");
		newProduct1.setQuantity(1);
		newRecipe1.setName("Arroz Con Pollo");
		newRecipe1.setPrice(10000);
		System.out.println("El nuevo cliente es : " + newClient.getName()+ " " + newClient.getLastname()  + " " + "¿tiene hijos?"+ " " + newClient.isHasChildrens());
		System.out.println("Ubicado en la mesa: " + newTable1.getNumber() + " " +  "Capacidad: " + newTable1.getCapacity() + " " + "Ubicacion:" + newTable1.getUbication());
		System.out.println("Productos Nuevos : " + newProduct1.getBrand() + " de " + newProduct1.getName() + " " + "Cantidad: " + newProduct1.getQuantity() + " " + "Precio:" + newProduct1.getPrice());
		System.out.println("Nombre de la receta nueva : " + newRecipe1.getName() + " " + "Precio:" + newRecipe1.getPrice());
		
		System.out.println (" ");
	
		System.out.println("--- Client 3 ----");
		
		newClient2.setName("Juan");
		newClient2.setHasChildrens(false);
		newProduct2.setName("Cariñoso");
		newProduct2.setBrand("Vino");
		newTable2.setUbication(" meza especial ");
		newTable2.setCapacity(2);
		newRecipe2.setName("Mini Wellington de Pollo");
		newRecipe2.setPrice(25000);
		System.out.println("El nuevo cliente es : " + newClient2.getName()+ " " + newClient2.getLastname()  + " " + "¿tiene hijos?" + " " + newClient2.isHasChildrens());
		System.out.println("Productos: " + newProduct2.getBrand() + " de " + newProduct2.getName() + " " + "Cantidad: " + newProduct2.getQuantity() + " " + "Precio:" + newProduct2.getPrice());
		System.out.println("Ubicado en la mesa: " + newTable2.getNumber() + " " +  "Capacidad: " + newTable2.getCapacity() + " " + "Ubicacion:" + newTable2.getUbication());
		System.out.println("Nombre de la receta romantica : " + newRecipe2.getName() + " " + "Precio:" + newRecipe2.getPrice());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
