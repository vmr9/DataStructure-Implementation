public class DoublyLinkedList {

    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createDLL (int value) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        node.next = null;
        node.prev = null;
        head = node;
        tail = node;
        size++;
        return head;
    }

    public void insertInDLL(int value, int position) {
        DoublyNode node = new DoublyNode();
        node.value = value;
        if (head == null) {
            createDLL(value);
        } else if (position == 0) {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        } else if (position >= size) {
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        } else {
            DoublyNode currNode = head;
            DoublyNode tempNode;
            int index = 0;
            while (index < position - 1) {
                currNode = currNode.next;
                index++;
            }
            tempNode = currNode.next;
            currNode.next = node;
            tempNode.next.prev = node;
            node.prev = currNode;
            node.next = tempNode.next;
        }
        size++;
    }

    public void traverseDll(){
        if (head == null){
            System.out.println("CircularSinglyLinkedList does not exist");
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

    public void reverseTraverseDll(){
        if (head == null){
            System.out.println("CircularSinglyLinkedList does not exist");
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

    public void searchInDll(int value){
        DoublyNode currNode = head;
        for (int i = 0; i < size; i++){
            if (currNode.value == value){
                System.out.println("The value is found in the "+i+" node");
            }
            currNode = currNode.next;
        }
    }

    public void deleteInDll (int position) {
        if (head == null) {
            System.out.println("DLL does ot exist");
        } else if (position == 0) {
            head = head.next;
            head.prev = null;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else if (position >= size) {
            tail = tail.prev;
            tail.next = null;
            size--;
            if (size == 0) {
                head = null;
                tail = null;
            }
        } else {
            DoublyNode currNode = head;
            for (int i = 0; i < position - 1; i++) {
                currNode = currNode.next;
            }
            currNode.next = currNode.next.next;
            currNode.next.prev = currNode;
            size--;
        }
    }

    public void deleteDll() {
        DoublyNode currNode = head;
        for (int i = 0; i < size; i++) {
            currNode.prev = null;
            currNode = currNode.next;
        }
        head = null;
        tail =null;
        size = 0;
    }
}
