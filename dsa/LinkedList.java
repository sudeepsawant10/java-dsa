
class LL{
    //inner class of LL that sores data and next pointer
    Node head;

    //To count size
    private int size;
    LL() {
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Insert/Add = (first or last)
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        //corner case
        if(head == null) {
            System.out.println("LL is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if(head == null) {
            System.out.println("LL is empty!");
            return;
        }
        size--;
        //only one element (corner case)
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;  //if head.next = null (means it is last)
        while(lastNode.next != null) {  //lastNode will store null=> null.next != NULL (error)
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        //unlinked last element
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public void printList() {
        Node currNode = head;
        if(head == null) {
            System.out.println("LL is empty!");
            return;
        }

        while(currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LL list = new LL(); //initialized the object list
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

    }

}

/*
One of the major operation Delete
Arraylist
- non-contigous
- Insert = O(n)
- Search = O(1)
- variable size
Linked List in java
- also non-contigous
- Constant operation for insert in between = O(1) (linked list is better)
- Search = O(n) (Array list is better)
- variable size (dynamic)

Scratch implementation
we have to analyse data structure for the particular problem

*/