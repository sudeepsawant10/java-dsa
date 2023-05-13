/*
- Without main program gets successfully compiled
- But it will give u error while executing/running program
Error: that could not find or load main
- class file / byte code for every class
- Multiple main functions are allowed in different classes
*/

class SolidReactangle {
    public static void main(String args[]) {
        for(int i=0; i<4; i++) {
            for(int j=0; j<5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class SolidReactangle2 {
   public static void main2(String args[]) {
        System.out.println("Hello World2");
    }
}