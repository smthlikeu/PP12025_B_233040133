package pertemuan3;

public class ListMain {
	
	public static void main (String[] args) {
		StrukturList list = new StrukturList ();
		list.addTail (3);
		list.addTail (4);
		list.addTail (5);
		list.addHead (2);
		
		System.out.println("Elemen: ");
		list.displayElement();
	}
}
