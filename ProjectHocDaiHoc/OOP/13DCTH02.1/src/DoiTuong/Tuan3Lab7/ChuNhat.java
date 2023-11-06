package DoiTuong.Tuan3Lab7;

public class ChuNhat {
    private double dai;
    private double rong;
    public ChuNhat(double dai, double rong) {
    	this.dai=dai;
    	this.rong=rong;
    }
    public ChuNhat() {
    	
    }
    public void setDai(double dai) {
    	this.dai=dai;
    }
    public void setRong(double rong) {
    	this.rong=rong;
    }
    public double getDai() {
    	return this.dai;
    }
    public double getRong() {
    	return this.rong;
    }
    public double getChuVi() {
    	return (this.dai+this.rong)/2;
    }
    public double getDienTich() {
    	return this.dai*this.rong;
    }
    public void xuat() {
    	System.out.println("Dài: "+this.getDai()+"Rộng: "+this.getRong());
    	System.out.println("Chu vi: "+this.getChuVi()+"Diện tích: "+this.getDienTich());
    }
}
