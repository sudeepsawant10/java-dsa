import java.util.Scanner;
class ArrayEg {
    public static int linearSearch(int arr[], int ele) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ele){
                return i;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        int[] marks = new int[3];
        // int marks[] = new int[3];
        marks[0] = 97;
        marks[1] = 89;
        marks[2] = 95;
        // System.out.println(marks); //[I@28a418fc (jargon=garbage value)(memory address (combination of class and address))
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0; i<3; i++) {
        //   System.out.println(marks[i]);
        // }

        //taking input from user
        System.out.println("Enter size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //by default
        System.out.println("By default values:");
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Now enter elements of array:");
        for(int i=0; i<size; i++) {
            System.out.print("numbers["+i+"] = ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array Elements:");
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }

        System.out.println("Element fount at "+linearSearch(numbers, 4)+" position");
    }
}
/*
Non-primitive type
- collection of same data type
Syntax:
type[] arr = new type[size];
eg.a
int[] marks = new int[3];
String[] names = new String[3];
zero-indexed
- automatic initialisation with null values (0) in java (by default)
foat 0.0
booleadn false
string ""
 c++ stores by default garbage value in variables like cx3928

 - it has property .length = arr size
*/