import java.util.*;

class problem0{
    public static float Average(int n1, int n2, int n3){
        float avg = (n1+n2+n3)/3;
        return avg;

    }

    public static void printSum(int size) {
        int sum=0;
        for(int i = 1; i<=size; i++) {
            sum+=i;
        }
        System.out.println("Sum of "+size+ "nnumber = "+ sum);
    }

    public static float radiusOfCircle(int r){
        float pi=3.17f;
        float radius = pi*(r*r);
        return radius;
    }

    public static void main(String args[]) {
        // int n1,n2,n3;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1: ");
        // n1 = sc.nextInt();
        // System.out.println("Enter number 2: ");
        // n2 = sc.nextInt();
        // System.out.println("Enter number 3: ");
        // n3 = sc.nextInt();
        // System.out.println("Average = "+Average(n1,n2,n3));
        // printSum(5);
        System.out.println(radiusOfCircle(5));
    }
}