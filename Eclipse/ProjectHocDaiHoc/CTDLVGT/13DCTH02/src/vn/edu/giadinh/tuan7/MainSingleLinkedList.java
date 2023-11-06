package vn.edu.giadinh.tuan7;

public class MainSingleLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Khai báo danh sách liên kết đơn
      SingleLinkedListTwo dSSP = new SingleLinkedListTwo();
//Tạo sản phẩm
      SanPham sp1 = new SanPham("chuối",20000);
      SanPham sp2 = new SanPham("táo",15000);
//thêm thứ tự sản phẩm
      dSSP.addNode(sp1);
      dSSP.addNode(sp2);
//In danh sách ra màn hình
      dSSP.inSingleLinkedList();
      dSSP.inSingleLinkedList();
	}

}
