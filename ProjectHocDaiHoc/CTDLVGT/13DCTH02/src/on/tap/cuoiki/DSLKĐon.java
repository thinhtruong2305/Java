package on.tap.cuoiki;

public class DSLKĐon {
//thuộc tính
	Node head,tail;
//phương thức
	public DSLKĐon() {
		head=null;
		tail=null;
	}
	public void addNode() {
	 BaLo bl= new BaLo();
	 bl.nhap();
	 Node newNode=new Node(bl);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		tail=newNode;
		tail.next=newNode;
	}
	public void addNode(BaLo data) {
		 Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			tail.next=newNode;
			tail=newNode;
		}
	public void inDSLKĐon() {
		Node nutHienTai;
		nutHienTai=head;
		if(nutHienTai==null) {
			System.out.print("Danh Sách Rỗng");
		}
		while(nutHienTai!=null) {
			nutHienTai.data.xuat();
			nutHienTai=nutHienTai.next;
		}
	}
}
