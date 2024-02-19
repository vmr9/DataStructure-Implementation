public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInSinglyLinkedList(int value, int position){
        Node node = new Node();
        node.value = value;
        if (head == null) {
            createSinglyLinkedList(value);
        } else if (position == 0) {
            node.next = head;
            head = node;
        } else if (position >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node currNode = head;
            int index = 0;
            while(index < position){
                currNode = currNode.next;
                index++;
            }
            Node tempNode = currNode.next;
            currNode.next = node;
            node.next = tempNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList(){
        if (head == null){
            System.out.println("SinglyLinkedList does not exist");
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

    public void searchInSinglyLinkedList(int value){
        Node currNode = head;
        for (int i = 0; i < size; i++){
            if (currNode.value == value){
                System.out.println("The value is found in the "+i+" node");
            }
            currNode = currNode.next;
        }
    }

    public void deleteInSinglyLinkedList(int position){
        Node tempNode;
        Node currNode = head;
        int index = 0;
        if (head == null){
            System.out.println("There are no nodes to be deleted in the SinglyLinkedList");
        } else if (position == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (position >= size) {
            while (index < size - 1) {
                currNode = currNode.next;
                index++;
            }
            currNode.next = null;
            size--;
            tail = size == 0 ? null : currNode;
        } else {
            while (index < position -1) {
                currNode = currNode.next;
                index++;
            }
            tempNode = currNode.next;
            currNode.next = tempNode.next;
            size--;
        }
    }

    public void deleteSinglyLinkedList() {
        head = tail = null;
        size = 0;
    }

}
