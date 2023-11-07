package AnimalDetail;

import KindOfAnimal.Canine;

public class Dog extends Canine{
	private String breed;
	
	public Dog() {
		
	}
	public Dog(String location,int doDoi,String kind,String name,String breed) {
		super(location,doDoi,kind,name);
		this.breed=breed;
	}
	
	protected String getBreed() {
		return this.breed;
	}
	protected void setBreed(String breed) {
		this.breed = breed;
	}
	
	protected void eat() {
		if(kiemTraDoThemAn(getDoDoi())==true) {
			System.out.println("Chó ăn xương");
		}else {
			System.out.println("No rồi");
		}
	}
	protected void makeNoise() {
		System.out.println("Gâu gâu");
	}
	public String toString() {
		return super.toString()+"\nGiống: "+this.breed;
	}
}
