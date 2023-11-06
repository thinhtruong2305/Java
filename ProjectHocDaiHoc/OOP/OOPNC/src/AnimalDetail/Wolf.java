package AnimalDetail;

import KindOfAnimal.Canine;

public class Wolf extends Canine{
	private boolean leaderWolf;
	
	public Wolf() {
		
	}
	public Wolf(String location,int doDoi,String kind,String name,boolean leaderWolf) {
		super(location,doDoi,kind,name);
		this.leaderWolf=leaderWolf;
	}
	
	protected boolean isLeaderWolf() {
		return this.leaderWolf;
	}
	protected void setLeaderWolf(boolean leaderWolf) {
		this.leaderWolf=leaderWolf;
	}
	
	protected void eat() {
		if(kiemTraDoThemAn(getDoDoi())==true) {
			System.out.println("Sói ăn thịt động vật");
		}else {
			System.out.println("No rồi -_-");
		}
	}
	protected void makeNoise() {
		System.out.println("tru");
	}
	protected void roam() {
		if(isLeaderWolf()==true) {
			System.out.println("đi theo bầy và con đầu đàn phải che chở");
		}else {
			System.out.println("đi theo bầy và tự chăm sóc nhau");
		}
	}
	public String kiemTraDanSoi() {
		String str = " không có sói đầu đàn";
		if(isLeaderWolf()==true) {
			str = " có sói đầu đàn";
		}
		return str;
	}
	public String toString() {
		return super.toString()+"\nBần sói này"+this.kiemTraDanSoi();
	}
}
