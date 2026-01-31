package application;

import java.util.Scanner;
import entities.Stock;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		System.out.println("Name:");
		String name = read.nextLine();

		System.out.println("Price:");
		double price = read.nextDouble();

		Stock product = new Stock(name, price);

//		product.name = "Computer"; - Não da pois estamos usando  encapsulamento

		System.out.println(product.toString());

		int op, new_quantity;

		do {
			System.out.println("-=-=-=-=-=-=-= MENU =-=-=-=-=-=-=-");
			System.out.println(" ├── 1. Added Quantity Products");
			System.out.println(" ├── 2. Removed Quantity Products");
			System.out.println(" ├── 3. Check Price");
			System.out.println(" ├── 4. Check Name");
			System.out.println(" ├── 5. Check Quantity");
			System.out.println(" ├── 6. Change Product Name");
			System.out.println(" ├── 7. Change Product Price");
			System.out.println(" └── 0. Exiting Program");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			op = read.nextInt();

			switch (op) {
			case 1:
				System.out.printf("1 - Enter number of products to be added in stock: ");
				new_quantity = read.nextInt();
				product.addProducts(new_quantity);
				System.out.println(product);
				break;
			case 2:
				System.out.printf("2 - Enter number of products to be removed from stock: ");
				new_quantity = read.nextInt();
				product.removeProducts(new_quantity);
				System.out.println(product.toString());
				break;
			case 3:
				System.out.printf("3. Check Price%n");
				System.out.printf("Current Price: %.2f%n", product.getPrice());
				break;
			case 4:
				System.out.printf("4. Check Name%n");
				System.out.printf("Current Name: %s%n", product.getName());
				break;
			case 5:
				System.out.printf("5. Check Quantity%n");
				System.out.printf("Current Quantity: %d%n", product.getQuantity());
				break;
			case 6:
				System.out.printf("6 - Change product name: %n");
				read.nextLine();
				name = read.nextLine();
				product.setName(name);
				System.out.println(product.toString());
				break;
			case 7:
				System.out.printf("7. Change Product Price: %n");
				price = read.nextDouble();
				product.setPrice(price);
				System.out.println(product.toString());
				break;
			case 0:
				System.out.println("0 - Exit Program");
				return;
			}
		} while (op != 0);

		read.close();
	}
}
