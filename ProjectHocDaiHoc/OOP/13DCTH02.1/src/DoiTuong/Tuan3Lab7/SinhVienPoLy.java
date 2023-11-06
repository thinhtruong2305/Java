package DoiTuong.Tuan3Lab7;

abstract public class SinhVienPoLy {
    //thuộc tính
	private String hoTen;
    private String nganh;
    //phương thức
    abstract protected double getDiem();
    protected String getHocLuc(double diem) {
    	String p=null;
    	if(diem >= 9) {
    		p=" Học lực xuất sắc"; 
    	}else if(diem <9 && diem>=7.5) {
    		p=" Học lực giỏi";
    	}else if(diem <7.5&&diem >=6.5) {
    		p=" Học lực khá";
    	}else if(diem <6.5&&diem >=5) {
    		p=" Học lực trung bình";
    	}else if(diem <5 ) {
    		p=" Học lực kém";
    	}
    	return p;
    }
    public void setHoTen(String hoTen) {
    	this.hoTen=hoTen;
    }
    public void setNganh(String nganh) {
    	this.nganh=nganh;
    }
    public String getHoTen() {
    	return this.hoTen;
    }
    public String getNganh() {
    	return this.nganh;
    }
    public void xuat() {
    	System.out.println("Họ và tên: "+getHoTen());
    	System.out.println("Điểm: "+getDiem());
    	System.out.println("Học lực: "+getHocLuc(getDiem()));
    }
}
