package entities;

public class Stock {
	// Atributos Encapsulados (private)
	private String name; // Encapsulado
	private double price; // Encapsulado
	private int quantity; // Encapsulado
	
	// Construtor / Sobrecargas
	public Stock() {
		
	}
	// Sobrecarga1
	public Stock(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga2
	public Stock(String name, double price){
		this.name = name;
		this.price = price;
		quantity = 0; // Opcional, por padrão já vem 0
	}
	
	// Metodos alteradores no encapsulamento
	public double getPrice() { //Verifica value price
		return this.price;
	}
	public String getName() { // Verifica value name
		return this.name;
	}
	public int getQuantity() { // Verifica value quantity
		return this.quantity;
	}
	public void setName(String name) { // altera name
		this.name = name;
	}
	public void setPrice(double price) { // altera price
		this.price = price;
	}
	
	// Não criamos o SetQuantity para proteger nosso produto, pois ele só pode alterar, se for removido ou adicionado.
	
	//Métodos
	public double allValuesInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "+ String.format("%.2f", allValuesInStock());
	}

}
