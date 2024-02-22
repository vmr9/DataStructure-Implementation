public class CircularDoublyLInkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createCDLL(int value) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        node.next = node;
        node.prev = node;
        tail = node;
        head = node;
        size = 1;
        return head;
    }

    public void insertInCdll(int value, int position) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        if (head == null) {
            createCDLL(value);
        } else if (position == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (position >= size) {
            node.prev = tail;
            node.next = head;
            tail.next = node;
            head.prev = node;
            tail = node;
        }else {
            DoublyNode currNode = head;
            int index = 0;
            while (index < position - 1) {
                currNode = currNode.next;
                index++;
            }
            node.next = currNode.next;
            currNode.next.prev = node;
            currNode.next = node;
            node.prev = currNode;
        }
        size++;
    }

    public void traverseCdll(){
        if (head == null){
            System.out.println("CircularDoublyLinkedList does not exist");
        }
        DoublyNode currNode = head;
        for (int i = 0; i < size; i++){
            System.out.print(currNode.value);
            if (i < size - 1){
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
        System.out.println(" ");
    }

    public void reverseTraverseCdll(){
        if (head == null){
            System.out.println("CircularDoublyLinkedList does not exist");
        }
        DoublyNode currNode = tail;
        for (int i = 0; i < size; i++){
            System.out.print(currNode.value);
            if (i < size - 1){
                System.out.print(" <- ");
            }
            currNode = currNode.prev;
        }
        System.out.println(" ");
    }

    public void searchInCdll(int value){
        DoublyNode currNode = head;
        for (int i = 0; i < size; i++){
            if (currNode.value == value){
                System.out.println("The value is found in the "+i+" node");
            }
            currNode = currNode.next;
        }
    }

    public void deleteInCdll(int position) {
        if (head == null) {
            System.out.println("The CDLL does not exist");
        } else if (position == 0) {
            head = head.next;
            tail.next = head;
            head.prev = tail;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else if (position >= size) {
            tail = tail.prev;
            head.prev = tail;
            tail.next = head;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else {
            int index = 0;
            DoublyNode currNode = head;
            while (index < position - 1) {
                currNode = currNode.next;
                index++;
            }
            currNode.next = currNode.next.next;
            currNode.next.prev = currNode;
            size--;
        }
    }

    public void deleteCdll() {
        DoublyNode currNode = head;
        int index = 0;
        while (index < size) {
            currNode.prev = null;
            currNode = currNode.next;
            index++;
        }
        head = null;
        tail = null;
    }
}
