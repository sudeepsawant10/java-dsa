
class ReversedLL{
    //inner class of LL that sores data and next pointer
    Node head;

    //To count size
    private int size;
    ReversedLL() {
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Insert/Add = (first or last)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
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
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

     public void reverseIterate() {
        //if only one node or null we consider it as reversed.
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;
        

        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            //update 
            prevNode = currentNode;
            currentNode = nextNode;
        }
        
        //single connection of head to the second node (unlinked it)
        head.next = null;
        //current node will point to last 
        //so make that last node to head to reverse it
        head = prevNode;

    }

    public static void main(String args[]) {
        LL list = new LL(); //initialized the object list
        list.addLast(1);    
        list.addLast(2);    
        list.addLast(3);    
        list.addLast(4);    
        list.printList();

        list.reverseIterate();
        list.printList();
    }

}

/*
Two ways:
1. Iterative
2. Recurssive

Output:
link will be change in reverse order
eg.
original= 1->2->3->4->null
Reversed= null<-1<-2<-3<-4
constraints:
1. no extra memory space complexity = O(1).
2. Time complexity = O(n)

Solution Approach
1) Iterative 
- use three pointers
     prev, current, and next
*/