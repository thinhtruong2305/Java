package vn.edu.giadinh.tuan7;

public class SingleLinkedListTwo {
//thuôc tính
	//nút đầu
	Node head;
	//nút đuôi
	Node tail;
//phương thức
	public SingleLinkedListTwo() {
		head = null;
		tail = null;
	}
	public void addNode(SanPham data) {
		Node newNode = new Node(data);
		//đưa vào danh sách liên kết có hai trường hợp:
		//1. danh sách rỗng (1)
		//2. danh sách đã có nút(2)
		// muốn làm z phải kiểm tra 
		if(head == null) {
			//đầu đuôi là nút mới (1)
			head = newNode;
			tail = newNode;
		}
		else {
			//(2)
		    tail.next = newNode;
		    tail = newNode;
		}
 }
	public void inSingleLinkedList() {
		Node nutHienTai;
		nutHienTai = head;
		if(head == null) {
			System.out.println("Danh Sach Rỗng");
			return;
		}
		while(nutHienTai != null) {
			nutHienTai.data.xuat();//in ra màn hình
			// chuyển qua nút kế tiếp
			nutHienTai = nutHienTai.next;
		}
	}
}
