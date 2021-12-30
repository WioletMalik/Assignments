package Classes;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car camery = new Car();
		Car camaro = new Car();
		Car benz = new Car();
		Car caprice = new Car();
		Car sonata = new Car();

		camery.drive();
		benz.drive();

		camery.make = "camery";
		camery.year = 2020;
		System.out.println("year" + camery.year);
		System.out.println("make" + camery.make);

		camaro.make = "camaro";
		camaro.year = 2018;
		System.out.println("make" + camaro.make);

		benz.make = "benz";
		benz.year = 2017;
		System.out.println("make" + benz.make);

		caprice.make = "caprice";
		caprice.year = 2019;
		System.out.println("make" + caprice.make);

		sonata.make = "sonata";
		sonata.year = 2021;
		System.out.println("make" + sonata.make);

		camery.year = 2019;
		System.out.println("year" + camery.year);

		camery.setMake();
		System.out.println("After using set make method " + camery.make);

	}

}
