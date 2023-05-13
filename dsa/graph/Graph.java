
import java.util.*;
class Graph {

    class Edge {
        int src, dest;
        Edge(int src, int dest) {
            this.src =src;
            this.dest = dest;
        }
    }
    public static void main(String args[]){
        /*
        Graph:

        1 ------ 2 --- 5
        \        |    / 
         \       |   /  
          \      |  / 
           3 --- 4 / 
         */
        int arr[] = {1,2,3,4,5,6};
        v=6;
        ArrayList<Integer> map = new ArrayList<>();

        for(int i=0; i<v; i++){
            map[i] = new Edge();
        }
        Edge e1 = new Edge(1,2);
        Edge e2 = new Edge(1,3);
        Edge e3 = new Edge(2,1);

        map.add(e1);
        map.add(e2);
        map.add(e3);
        // ArrayList<Integer> map = new ArrayList<Integer>();
    }
    
}