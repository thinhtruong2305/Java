package KindOfAnimal;

import Animal.Animal;

public abstract class Canine extends Animal {
	private String name;
	
	protected Canine() {
		
	}
	protected Canine(String location,int doDoi,String kind, String name) {
		super(location,doDoi,kind);
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	protected void roam() {
		System.out.println("Đi theo bầy");
	}
	protected abstract void eat();
	protected abstract void makeNoise();
	public String toString() {
		return super.toString()+"\nTên: "+this.name;
	}
}
