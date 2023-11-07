package AutoAddDeliveryDate;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 100;
		Date ngayTao = new Date();
		NgayGiao ngayGiao = new NgayGiao(ngayTao, 3, 8, 22, value, 30);
		System.out.println(ngayGiao.tinhNgayGiaoHang(1).getTime());
		System.out.println(ngayGiao.tinhNgayGiaoHang(100).getTime());
	}

}
