package AnimalDetail;

import Animal.Animal;

public class Hippo extends Animal {
	private float weight;
	private float soLuongThucAn;
	
	public Hippo() {
		
	}
	public Hippo(String location,int doDoi,String kind,String name,float weight,float soLuongThucAn) {
		super(location,doDoi,kind,name);
		this.setWeight(weight);
		setSoLuongThucAn(soLuongThucAn);
	}
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getSoLuongThucAn() {
		return this.soLuongThucAn;
	}
	public void setSoLuongThucAn(float soLuongThucAn) {
		this.soLuongThucAn = soLuongThucAn;
	}
	
	protected boolean kiemTraDoThemAn(int doDoi) {
		boolean an=false;
		if(doDoi<=60) 
			return an=true;
		return an;
	}
	protected String eatAccordingToQuantity(float soLuongThucAn) {
		String str=null;
		if(kiemTraDoThemAn(getDoDoi())==true&&soLuongThucAn<getWeight()) {
			str="Hà mã ăn trái cây vẫn còn đói";
		}else if(kiemTraDoThemAn(getDoDoi())==true&soLuongThucAn==getWeight()){
			str="Hà mã ăn trái cây và đủ ăn";
		}else if(kiemTraDoThemAn(getDoDoi())==true&&soLuongThucAn>getWeight()){
			str="Hà mã ăn trái cây và có thể no";
		}else {
			str="No rồi ;-;";
		}
		return str;
	}
	protected void eat() {
		eatAccordingToQuantity(getSoLuongThucAn());
	}
	protected void makeNoise() {
		System.out.println("oa");
	}
	protected void roam() {
		System.out.println("Lúc đi theo đàn lúc mình");
	}
	public String toString() {
		return super.toString1()+"\nCân nặng: "+this.weight+"\nSố lượng thức ăn: "+this.soLuongThucAn;
	}
}
