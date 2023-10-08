package exam;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human jiwon = new Human("jiwon");
		jiwon.setAge(30);
		System.out.println(jiwon.name);
		System.out.println(jiwon.getAge());
		
		Car Tuscon = new Car();
		Tuscon.setColor("gray");
		Tuscon.setType("suv");
		
		System.out.println(Tuscon.getType());
		System.out.println(Tuscon.getColor());
		
		Beverage Americano = new Beverage("Americano");
		Americano.setIsCoffee(true);
		Americano.setPrice(2000);
		
		System.out.println(Americano.getIsCoffee());
		System.out.println(Americano.getPrice());
		System.out.println(Americano.name);
	}

}
