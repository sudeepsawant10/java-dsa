
public class Recursion2 {
    public static void printSum(int i,int n, int sum) {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }

    public static int calcFactorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        // int fact_nm1 = calcFactorial(n-1);
        // int fact_n = n* fact_nm1;
        // return fact_n;
        return n * calcFactorial(n-1);
    }

    public static void printFibo(int a, int b , int n) {
        if(n == 0){
            return ;
        }
        int c = a+b;
        System.out.println(c); 
        printFibo(b, c, n-1);
    }
    
   
    public static void main(String args[]) 
    {
        // printSum(0,5,0);
        // System.out.println(calcFactorial(5));
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        printFibo(a,b,n-2);
    }
}