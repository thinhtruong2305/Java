package tienthinh.vn.baitap;

public class Node {
  //thuộc tính đối tượng node
	String info;
	Node next;
  //phương thức của đối tượng
	public Node() {
		
	}
	public Node(String data) {
		info = data;
	}
	public Node(String data, Node x) {
		info = data;
		next = x;
	}
}
