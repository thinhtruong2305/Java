package on.tap.cuoiki;

public class Node {
//thuộc tính
	 BaLo data;
	 Node next;
//phương thức
	 public Node() {
		 
	 }
	 public Node(BaLo data_) {
		 data=data_;
		 next=null;
	 }
	 public Node(Node next_,BaLo data_) {
		 next=next_;
		 data=data_;
	 }
}
