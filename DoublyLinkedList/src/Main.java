public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dLL = new DoublyLinkedList();

        dLL.createDLL(0);
        System.out.println(dLL.head.value);

        dLL.insertInDLL(5,1);
        dLL.insertInDLL(6,2);
        dLL.insertInDLL(7,3);
        dLL.insertInDLL(8,4);

        dLL.traverseDll();
//        dLL.reverseTraverseDll();
        dLL.searchInDll(6);


        dLL.deleteInDll(1);

        dLL.traverseDll();
    }
}