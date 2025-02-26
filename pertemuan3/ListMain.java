package pertemuan3;

public class ListMain {
    public static void main(String[] args) {
    	StrukturList list1 = new StrukturList();
        StrukturList list2 = new StrukturList();

        // Uji coba pertama: 2.1 3.4 4.5
        list1.addTail(2.1);
        list1.addTail(3.4);
        list1.addTail(4.5);
        System.out.print("List 1: ");
        list1.displayElement(); 
        System.out.println(" ");

        // Uji coba kedua: 3.4 2.1 1.1 4.5 5.5
        list2.addHead(3.4);
        list2.addMid(1.1, 2);
        list2.addMid(2.1, 2);
        list2.addTail(4.5);
        list2.addTail(5.5);
        System.out.print("List 2: ");
        list2.displayElement();
    }
}