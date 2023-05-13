import java.util.LinkedList;

class CollectionLL {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        list.add("item");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Our linked list:");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //delete first
        list.removeFirst();
        System.out.println(list);

        //delete last
        list.removeLast();
        System.out.println(list);

        //delete using index(in between)
        list.remove(2);

    }
}