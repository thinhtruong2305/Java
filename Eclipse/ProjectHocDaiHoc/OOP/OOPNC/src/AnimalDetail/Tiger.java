package AnimalDetail;

import KindOfAnimal.Feline;

public class Tiger extends Feline {
	private String furColor;
	
	protected Tiger() {
		
	}
	public Tiger(String location,int doDoi,String kind,String name,String furColor) {
		super(location,doDoi,kind,name);
		setFurColor(furColor);
	}
	
	protected String getFurColor() {
		return this.furColor;
	}
	protected void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	protected void eat() {
		if(kiemTraDoThemAn(getDoDoi())==true) {
			System.out.println("Hổ ăn thịt động vật");
		}else {
			System.out.println("No rồi @.@");
		}
	}
	protected void makeNoise() {
		System.out.println("Gầm");
	}
	public String toString() {
		return super.toString()+"\nMàu lông: "+this.furColor;
	}
}
