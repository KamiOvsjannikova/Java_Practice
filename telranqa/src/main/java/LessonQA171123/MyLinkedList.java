package LessonQA171123;

public class MyLinkedList { // svjazannij spisok- eto nabor 1-ogo i togo ze tipa, kotorij ssilaetsja na drugie elemnti. MyLinkedList - dvustoronnej spisok emplimentiruet
    private Node head;

    //Time complexity 0(1)
    public void add(int data) {
        Node newNode = new Node(data, null); // peredaem peremen Data
        if (head == null) {// proverka est li svjaz spisok ---> eto esli v golove ne bilo. V pervij raz spisok sozdaem
            //new element is head
            head = newNode; // Node delaem golovoj
            return;
        }
        // a esli uze bilo, to nuzno pered pervim elementom dobavitj
        newNode.setNext(head); //ssilaemsja na prediduw glavnij element. Esli bilo uze v golove chto-to
        head = newNode;//nuzno novuju golovu zapisatj
    }
    // method , kotor. v konec budet stavitj v svjaz spisok
    public void pushToTail(int data) {
        Node newNode = new Node(data, null); // sozdaem novij element
        if (head == null) {
            head = newNode;
            return;
        }
        //najti posled element, esli spisok ne pustoj
        Node current = head;
        while (current.getNext() != null) {// != ne raven null na ssilku ssilatsja nado
            current = current.getNext(); // dojti do posled.elementa
        }
           current.setNext(newNode);
    }

    //vivod spiska v console
    public void print() {
        //perebiratj vse elementi poka ne konchatsja, no nachinaetsja s head
        Node current = head; // prisvoili current pervij element
        while (current != null) {
            Integer data = current.getData(); // poka element current raven kakomu-to elementu --> poka ne stanet null
            System.out.println(" " + data);
            current = current.getNext();

        }
    }

    public int size() {
        int size = 0; //kol-vo elementov poschitatj --> 0 esli nichego do etogo net
        Node current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        } // esli spisok pustoj vernjetsja 0
        return size;
    }


}

