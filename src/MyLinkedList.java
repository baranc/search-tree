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
    public boolean removeItem(ListItem item){
        if(item != null){
            System.out.println("Deleting item" + item.getValue());

            ListItem currentItem = root;
            while(currentItem != null){
                int comparison = currentItem.compareTo(item);
                if(comparison == 0){
                    if(currentItem = root){
                        root = currentItem.next();
                    }else{
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next()!=null){
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }
                    return true;
                } else if(comparison < 0)
                    currentItem = currentItem.next();
                else return false;
            }
        }
        return false;
    }
    public void traverse(ListItem root){
        if(root == null){
            System.out.println("the list is empty");
        }
        else
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
    }
}
