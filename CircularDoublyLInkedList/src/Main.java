public class Main {
    public static void main(String[] args) {

        CircularDoublyLInkedList cdll = new CircularDoublyLInkedList();

        //create cdll
        cdll.createCDLL(0);

        System.out.println(cdll.head.value);

        //Insert in cdll
        cdll.insertInCdll(5,1);
        cdll.insertInCdll(6,2);
        cdll.insertInCdll(7,3);
        cdll.insertInCdll(8,4);

        //traverse cdll
        cdll.traverseCdll();
        cdll.reverseTraverseCdll();

        //search in cdll
        cdll.searchInCdll(5);

        //delete node in CDLL
        cdll.deleteInCdll(4);

        cdll.traverseCdll();
    }
}