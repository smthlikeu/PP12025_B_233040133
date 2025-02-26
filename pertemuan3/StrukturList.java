package pertemuan3;

public class StrukturList {
    private Node HEAD;

    public boolean isEmpty() {
        return HEAD == null;
    }

    // Menambahkan elemen di awal (head)
    public void addHead(double data) {
        Node newNode = new Node(data);	
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(double data, int position) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            // Jika list kosong, jadikan newNode sebagai HEAD
            HEAD = newNode;
        } else if (position == 1) {
            // Jika posisi = 1, tambahkan di awal
            newNode.setNext(HEAD);
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            int i = 1;
            while (curNode != null && i < position - 1) {
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                newNode.setNext(curNode.getNext());
                curNode.setNext(newNode);
            } else {
                // Jika posisi melebihi panjang list, tambahkan di akhir
                Node lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    lastNode = lastNode.getNext();
                }
                lastNode.setNext(newNode);
            }
        }
    }
    
    // Menambahkan elemen di akhir (tail)
    public void addTail(double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    // Menampilkan elemen dalam linked list
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    
}