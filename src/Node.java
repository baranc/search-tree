public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }
    ListItem next(){
        return ListItem listItem;
    };
    ListItem setNext(ListItem listItem){
        rightLink = listItem;
        return rightLink;
    }
    ListItem previous(){
        return ListItem listItem;
    };
    ListItem setPrevious(ListItem listItem){
        leftLink = listItem;
        return leftLink;
    }
    int compareTo(ListItem a, ListItem b){
        if(valueA > valueB)
            return 1;

    }


}
