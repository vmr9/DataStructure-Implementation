//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        //creating a singlyLinkedList
        sLL.createSinglyLinkedList(0);

        //insert nodes in the singlyLinkedList
        sLL.insertInSinglyLinkedList(5, 1);
        sLL.insertInSinglyLinkedList(6, 2);
        sLL.insertInSinglyLinkedList(7, 3);
        sLL.insertInSinglyLinkedList(8, 4);

        //traverse through the singlyLinkedList
        sLL.traverseSinglyLinkedList();

        //search a value in a singlyLinkedList
        sLL.searchInSinglyLinkedList(0);

        //delete a node in singlyLinkedList
        sLL.deleteInSinglyLinkedList(1);

        sLL.traverseSinglyLinkedList();

        //delete whole singlyLinkedList
        sLL.deleteSinglyLinkedList();

        sLL.traverseSinglyLinkedList();
    }
}