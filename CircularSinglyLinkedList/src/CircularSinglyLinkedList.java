public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int value) {
        Node node = new Node();
        node.value = value;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInCsll(int value, int position) {
        Node node = new Node();
        node.value = value;
        Node tempNode;
        Node currNode = head;
        int index = 0;
        if (head == null) {
            createCSLL(value);
        } else if (position == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (position >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            while (index < position - 1) {
                currNode = currNode.next;
                index++;
            }
            tempNode = currNode.next;
            node.next = tempNode;
            currNode.next = node;
        }
        size++;
    }

    public void traverseCsll(){
        if (head == null){
            System.out.println("CircularSinglyLinkedList does not exist");
        }
        Node currNode = head;
        for (int i = 0; i < size; i++){
            System.out.print(currNode.value);
            if (i < size - 1){
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
        System.out.println(" ");
    }

    public void searchInCsll(int value){
        Node currNode = head;
        for (int i = 0; i < size; i++){
            if (currNode.value == value){
                System.out.println("The value is found in the "+i+" node");
            }
            currNode = currNode.next;
        }
    }

    public void deleteInCsll(int position) {
        int index = 0;
        Node currNode = head;
        if (head == null) {
            System.out.println("Cssl Does not exist");
        } else if (position == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head.next = null;
                head = null;
                tail =null;
            }
        } else if (position >= size) {
            while (index < size - 1) {
                currNode = currNode.next;
            }
            if (currNode == head) {
                head.next = null;
                head = null;
                tail = null;
                size--;
            }
            currNode.next = head;
            tail = currNode;
            size--;
        } else {
            while (index < position - 1) {
                currNode = currNode.next;
                index++;
            }
            currNode.next = currNode.next.next;
            size--;
        }
    }

    public void deleteCsll() {
        head = tail = null;
        size = 0;
    }
}
