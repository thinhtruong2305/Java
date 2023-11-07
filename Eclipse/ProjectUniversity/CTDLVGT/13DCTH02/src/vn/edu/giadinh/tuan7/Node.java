package vn.edu.giadinh.tuan7;


public class Node {
//thuộc tính 
	//vùng dữ liệu
    SanPham data;
    //vùng liên kết
    Node next;
//phương thức 
    //hàm tạo rỗng
    public Node() {
    	
    }
    //hàm tạo một tham số
    public Node(SanPham _data) {
    	data = _data;
    	next = null;
    }
    //hàm tạo hai tham số
    public Node(SanPham _data, Node _next){
    	data = _data;
    	next = _next;
    }
}
