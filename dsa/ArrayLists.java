/*
Data Structure
ArrayList
- most important concept of collection framework(collection of classes, interfaces...)
Array
1. contigous memory (unavailable)
2. fixed size (cannot extend size)
3. It can store primitive type(int, float, char..) and objects

Overcomes problem of array
ArrayList:
1. non-contiguous memory
2. It has variable size
3. It can store only objects
4. Created in heap memory


Operations :

Declare an ArrayList of different Types
1. Add Element
2. Get Element
3. Add Element at a specific Index
4. Set Element at a specific Index
5. Delete Element from an Index
6. Size of the List
7. Loop/Iterate on the List
8. Sort the List
*/

import java.util.ArrayList;
import java.util.Collections;



class ArrayLists {
    public static void main(String args[]) {
        // class = >Integer | Float | Boolean..

        //define
        ArrayList<Integer> list = new ArrayList<Integer>();
        //string type
        // ArrayList<String> list2 = new ArrayList<>();

        //add elemnt (in last)
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements using index
        int ele = list.get(1);
        System.out.println(ele);

        //add in between (using index)
        list.add(2, 10);
        System.out.println(list);

        //set element (change existing list element)
        list.set(2, 1);
        System.out.println(list);

        //delete element (using index)
        list.remove(3);
        System.out.println(list);

        //count elements size()
        System.out.println(list.size());

        list.add(8);
        list.add(7);
        list.add(10);
        //loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        
        //sorting Collection is class (doesn't work for array)
        Collections.sort(list);
        System.out.println(list);
        



    }
}

/*
Collection Framework
DSA:
eg. student and parent information in one pair.

- Readymade dsa Tools

Collection Framework
- Combination of classes and interfaces
1) Interfaces (use in the form of classes)
        Iterable
        Collection
list    Queue      Set
methods:
add
size
remove
iterate
addAll
removeAll
clear

    1. List (interface)
        - contains 3 imp classes
        a. ArrayList (variable size)
        b. LinkedList  (linked)
        c. Vector   (thread safe)(similar to ArrayList)
            c1. Stack   (imp)

    2. Queue (interface) (FIFO)
        - contain 3 classes
        a. PriorityQueue (uses priority )
        b. LinkedList   (ll using queue)
        c. Deque    (Double ended queue)(Insertion in both the end)
            c1. ArrayDeque 
    
    3. Set (interface) (most imp inteface of java also map interface) #table is imp topic -google
        a. HashSet 
        b. LinkedHashSet (linked element)
        c. SortedSet    (sorted)
            c1. TreeSet 

    4. Map (interface) (maps two thing: key and value) (internally uses set)
        a. Hashmap
        b. LinkedHashMap
        c. SortedMap
            c1. TreeMap (acoording to key it will sort)
        d. Hashtable

    (Tree and graph are implemented by these ds)
        
*/