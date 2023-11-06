package tienthinh.vn.baitap;

public class SingleLinkedList {
  //thuộc tính của đối tượng
   Node head;
   Node tail;
  //phương thức của đối tượng
   public SingleLinkedList() {
	   head = null;
	   tail = null;
   }
   //cách khai báo nhanh hơn
   /*thuộc tính
    Node head = null, tail = null;*/
   public void ThemNode(String data) {
	   Node newNode = new Node();
	   if(head == null) {
		   head = newNode;
		   tail = newNode;
	   }
	   else {
		   tail.next = newNode;
		   tail = newNode;
	   }
   }
}
