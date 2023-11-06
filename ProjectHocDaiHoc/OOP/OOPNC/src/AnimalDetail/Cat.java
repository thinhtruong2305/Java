package AnimalDetail;

import KindOfAnimal.Feline;

public class Cat extends Feline{
	private String breed;
	
	public Cat() {
		
	}
	public Cat(String location, int doDoi, String kind, String name,String breed) {
		super(location,doDoi,kind,name);
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	
	protected void eat() {
		if(kiemTraDoThemAn(getDoDoi())==true) {
			System.out.println("Mèo ăn hạt thức ăn cho mèo hoặc cơm,cá");
		}else {
			System.out.println("no rồi!!!");
		}
	}
	protected void makeNoise() {
		System.out.println("meo meo");
	}
	
	public String toString() {
		return super.toString()+"\nGiống :"+this.breed;
	}
}
