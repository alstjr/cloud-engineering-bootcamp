package pack08_worksho05;

public class Coffee {

	private String name;
	private int price;
	
	public Coffee() {}

	public Coffee(String coffee, int price) {
		this.name = coffee;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  name + "\t" + price + "원";
	}
	
	
	
	
}
