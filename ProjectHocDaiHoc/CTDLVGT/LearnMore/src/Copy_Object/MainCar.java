package Copy_Object;

public class MainCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Roll Royce", "Phamtom", 2019);
		//Car car2 = new Car("Ford", "Mustang", 2010);
		//car2.copy(car1);
		Car car2 = new Car(car1);
		System.out.println(car1);
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println(car2);
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
