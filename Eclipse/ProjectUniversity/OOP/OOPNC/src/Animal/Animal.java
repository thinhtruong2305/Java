package Animal;

public abstract class Animal {
	private String location;
	private int doDoi;
	private String kind;
	private String name;
	private static int soLuongThuVat;
	
	protected Animal() {
		
	}
	protected Animal(String location, int doDoi,String kind) {
		this.location = location;
		this.doDoi = doDoi;
		this.kind = kind;
		soLuongThuVat++;
	}
	protected Animal(String location,int doDoi,String kind,String name) {
		setLocation(location);
		setDoDoi(doDoi);
		setKind(kind);
		setName(name);
		soLuongThuVat++;
	}
	
	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getDoDoi() {
		return this.doDoi;
	}
	public void setDoDoi(int doDoi) {
		this.doDoi = doDoi;
	}
	
	public String getKind() {
		return this.kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getSoLuongThuVat() {
		return Animal.soLuongThuVat;
	}
	
	protected boolean kiemTraDoThemAn(int doDoi) {
		boolean an=false;
		if(doDoi<50)
			return an=true;
		return an;
	}
	protected abstract void eat();
	protected void sleep() {
		System.out.println("ngủ");
	}
	protected abstract void makeNoise();
	protected abstract void roam();
	public String toString() {
		return "Địa điểm: "+this.location+"\nĐộ đói: "+this.doDoi+"\nLoài: "+this.kind+"\nSố lượng thú vật: "+Animal.soLuongThuVat;
	}
	public String toString1() {
		return "Địa điểm: "+this.location+"\nĐộ đói: "+this.doDoi+"\nLoài: "+this.kind+"\nTên: "+this.getName()+"\nSố lượng thú vật: "+Animal.soLuongThuVat;
	}
}
