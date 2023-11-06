package KindOfAnimal;

import Animal.Animal;

public abstract class Feline extends Animal{
	private String name;
	
	protected Feline() {
		
	}
	protected Feline(String location, int doDoi,String kind, String name) {
		super(location,doDoi,kind);
		setName(name);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected abstract void eat();
	protected abstract void makeNoise();
	protected void roam() {
		System.out.println("đi đơn lẻ");
	}
	
	public String toString() {
		return super.toString()+"\nTên: "+this.name;
	}
}
