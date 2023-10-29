package entities;

public class Product {

	private String name;

	@Override
	public String toString() {
		return "O Produto é " + name + ", price=" + price + "";
	}

	private double price;

	public Product(String name, double price) {

		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
