class MyLL {
    Node head;
    private int size;
    MyLL(){
        this.size=0;
    }

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        newNode.data = data;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next = newNode;
    }

    public void print() {
        if(head == null){
            System.out.println("Linked list is empty!");
        }
        else{
            Node currNode = head;
            while(currNode != null) {
                System.out.println(currNode.data);
                currNode = currNode.next;
            }
        }
    }

    public static void main(String args[]) {
        MyLL list = new MyLL();
        list.insertAtBegin(10);
        list.insertAtBegin(0);
        list.print();
    }
}