package LessonQA171123;

public class TestMyLiknkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1); // new Node(1, null)
        list.add(3); // new Node(3, null)
        list.add(4); // new Node(4, null)
        list.add(8);// new Node(8, null)

        //8 -> 4 -> 3 -> 1 --> null eto 1 , 3 eto node1, 4 eto node2, 8 eto node3

        list.print(); // eto dlja togo chtobi zapustitj code iz MyLinkedList --> vivod budet  8 4 3 1

        System.out.println("Size myLinkedList = " + list.size());// method size vizivaem --> budet ravno4
        list.add(0); //proverka, chto budet 5 //0 -> 8 -> 4 -> 3 -> 1

        //0 -> 8 -> 4 -> 3 -> 1 ->7
        list.pushToTail(7);
        list.print();

        System.out.println();
        System.out.println("---------------------");
          /*
        // Eto proishodit vnutri klassa MyLinkedList
        // eto primer sozdanija LinkedList bez dop klassa, to na ojectah
        // klassa Node

        Node node1 = new Node(1, null);
        Node node2 = new Node(3, node1);
        Node node3 = new Node(4, node2);
        Node head = new Node(8, node3);

        Node current = head;
        while (current != null) {
            Integer data = current.getData();
            System.out.print(" " + data);
            current = current.getNext();
        }
        */
    }
}
