public class Main {
    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        //create a csll
        csll.createCSLL(0);
        System.out.println(csll.head.value);


        //insert nodes in csll
        csll.insertInCsll(5,1);
        csll.insertInCsll(6,2);
        csll.insertInCsll(7,3);
        csll.insertInCsll(8,4);
        csll.insertInCsll(9,3);

        System.out.println(csll.head.next.value);


        //traverse csll
        csll.traverseCsll();

        //search in csll
        csll.searchInCsll(6);

        //delete node from CSLL
        csll.deleteInCsll(5);

        csll.traverseCsll();
    }
}