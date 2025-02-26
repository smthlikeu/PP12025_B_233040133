package pertemuan3;

public class Node {
	private double data;
	private Node next;
	
	/** Inisialisasi atribut node */
	
	public Node(double data) {
		this.data = data;
	}
	
	/** Setter & Getter */
	
	public void setData (double data) {
		this.data = data;
	}
	
	public double getData() {
		return data;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
}
