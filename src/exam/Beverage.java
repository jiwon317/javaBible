package exam;

public class Beverage {
	String name;
	private boolean isCoffee;
	private int price;

	Beverage(String name) {
		this.name = name;
	}
	public void setIsCoffee(boolean isCoffee) {
		this.isCoffee = isCoffee;		
	}
	public void setPrice(int Price) {
		this.price = Price;
	}
	public boolean getIsCoffee() {
		return this.isCoffee;
	}
	public int getPrice() {
		return this.price;
	}
}