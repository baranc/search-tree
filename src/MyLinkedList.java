public class MyLinkedList implements NodeLIst{
    private ListItem root;

    public ListItem getRoot() {
        return root;
    }

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
    public boolean addItem(ListItem newItem){
        if(root == null){
            root = newItem;
            return true;
}
        ListItem currentItem = root;
        while(currentItem!=null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
                return true;
            }else{
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }
    public boolean removeItem(ListItem listItem){

    }
    public void traverse(ListItem root){

    }
}
