package pertemuan2;

public class NodeMain {
    public static void main(String[] args) {
        // Membuat node
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);
        Node n5 = new Node(2);
        Node n6 = new Node(3);

        // Membuat relasi node bagian A
        n1.setNext(n2);    
        n2.setNext(n3);    
        n3.setNext(n4);    
        n4.setNext(null);  
        
     // Menampilkan Node  dengan Pointer p bagian A
        Node p = n1;
        while(p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
        System.out.println();

        // Membuat relasi node bagian B
        n5.setNext(n6);    
        n6.setNext(n1);    
        n1.setNext(n2);    
        n2.setNext(n3);    
        n3.setNext(null);  
        
     // Menampilkan Node  dengan Pointer p bagian B
        p = n5;
        while(p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}