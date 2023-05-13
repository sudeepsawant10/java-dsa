/*
-Program always start from main function steps
            Data Types
1) Primitive (System 64-bit)
1. byte     1byte = 8bits
2. short    
3. char     2Byte
4. boolean
5. int      4Byte
6. long     8Byte
7. float    4Byte
8. double   8Byte

2) Non - Primitive (customised created by user)
1. String
2. Array
3. Class
4. Object
5. Interface
Fundamentals
Works on priorities
* - % > - +
n!= n * (n-1)*(n-2)...
*/

import java.util.*;
class DataTypes {
    public static void printHello(){
        System.out.println("Hello from printHello()\n");
        return;
    }
    public static void Table2(){
        for(int i = 2; i<=2*10; i+=2) {
            System.out.println(i);
        }
    }
    public static int factorial(int num) {
        int f=1;
        if(num<=0) {
            System.out.println("Invalid number");
            return 0;
        }
        for(int i=num; i>=1; i--) {
            f= f*i;
        }
        return f;
    }

    public static void main(String args[]) {
        //To take input
        Scanner sc = new Scanner(System.in);
        // // String name = sc.next();    //Takes one token(word)
        // String name = sc.nextLine();    //takes statement
        // System.out.println(name);
        // int age = sc.nextInt();
        // System.out.println("Your age "+age);
        // float marks = sc.nextFloat();
        // System.out.println("Marks : "+marks);
        // byte num = sc.nextByte();   //-128 to 127
        // System.out.println(num);
        // short num2 = sc.nextShort();    //-32,768 to 32,767
        // System.out.println(num2);
        System.out.println("Hello1 from main...\n");
        printHello();
        System.out.println("Hello2 from main...\n");
        Table2();
        int fact = factorial(5);
        System.out.println(fact);
    
    }
}