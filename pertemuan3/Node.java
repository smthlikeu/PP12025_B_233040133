package pertemuan3;

public class Node {
	private int data;
	private Node next;
	
	/** Inisialisasi atribut node */
	
	public Node(int data) {
		this.data = data;
	}
	
	/** Setter & Getter */
	
	public void setData (int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
}
