public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "słoik czekolada baton czekolada lizak napój chrupki";
        String [] data = stringData.split(" ");
        for (String datum : data) {
            list.addItem(new Node(datum));
        }

    }
}
