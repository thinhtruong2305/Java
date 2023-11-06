package AnimalDetail;

import KindOfAnimal.Feline;

public class Lion extends Feline{
	private boolean bom;
	private String sexual;
	
	public Lion() {
		
	}
	public Lion(String location, int doDoi, String kind,String name, boolean bom, String sexual) {
		super(location,doDoi,kind,name);
		setBom(bom);
		setSexual(sexual);
	}
	
	public boolean isBom() {
		return this.bom;
	}
	public void setBom(boolean bom) {
		this.bom = bom;
	}
	public String getSexual() {
		return this.sexual;
	}
	public void setSexual(String sexual) {
		this.sexual = sexual;
	}
	
	protected void eat() {
		if(kiemTraDoThemAn(getDoDoi())== true) {
			System.out.println("Sư tử ăn thịt động vật");
		}else {
			System.out.println("no rồi không ăn đâu");
		}
	}
	protected void makeNoise() {
		System.out.println("gầm");
	}
	protected String kiemTraBom(boolean bom) {
		String str=null;
		if(bom == false) {
			str = "sư tử không có bờm";
		}
			str = "sư tử có bờm";
		return str;
	}
	protected String kiemTraBom() {
		String str="sư tử có bờm";
		if(this.bom == false||this.sexual== "nữ") {
			str = "sư tử không có bờm";
		}
		return str;
	}

	public String toString() {
		return super.toString()+"\nGiới tính: "+this.sexual+"\nCon "+this.kiemTraBom();
	}
}
