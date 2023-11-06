package ThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChuyenDoiNgay {
	private static SimpleDateFormat dateFormat;
	
	//Chuyển một chuỗi ngày như 12/05/2001 vào thì sẽ chuyển thành kiểu dữ liệu Date
	public static Date chuyenChuoiThanhNgay(String ngay) {
		ChuyenDoiNgay.dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
		try {
			return dateFormat.parse(ngay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	//Chuyển Date thành dạng chuỗi dd/MM/yyyy
	public static String chuyenNgayThanhChuoi(Date ngay) {
		ChuyenDoiNgay.dateFormat =  new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(ngay);
	}
	
	//Chuyển Date thành dạng chuỗi dd/MM/yyyy hh:mm:ss
	public static String chuyenNgayGioThanhChuoi(Date ngay) {
		ChuyenDoiNgay.dateFormat =  new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		return dateFormat.format(ngay);
	}
}
