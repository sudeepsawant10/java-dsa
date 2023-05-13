import java.util.*;
class Strings{
    public static void main(String args[]) {
        //declare string
        String name = "Tony";
        String fullname = "Tony stark";
        String sentence = "My name is tony stark.";

        //user string input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name:");
        // String name2 = sc.nextLine();
        // System.out.println("Your name is "+name2);

        //imp functions of string 
        //1. concatenation
        String firstName = "Tony", lastName = "stark";
        String fullName = firstName +" "+lastName;
        System.out.println(fullName);
        
        //2. length
        System.out.println("Length = "+fullName.length());

        //3. taking one element =>charAt() =>returns char
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //4. compare
        String name1="Tony", name2="Tony";
        //compareTo=>
        //  s1> s2 returns +ve value
        // or s1==s2 returns 0
        // or s1<s2 returns -ve value
        //comparison
        //eg. hello wello
        //hello>wello h<w
        // aahello aabello  h>b
        // hello cello h>c

         if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

        if(name1 == name2) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");

        }

        //Refering to string objects (use .compareTo)
        if(new String("Tony") ==new String("Tony") ) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are NOT equal");

        }

        //5. substrings
        String sentence2 =  "My name is Tony";
        //print Tony
        //substrings(int beginIndex, int endIndex)
        //not including endIndex
        String myname = sentence2.substring(11,15);
        System.out.println(myname);
        System.out.println(sentence2.substring(11));    //ending is last 

        //type cast or parsing
        //strings are immutable cannot change
        String str1 = "123";
       int number3 = Integer.parseInt(str1);
       System.out.println(number3);

       int number = 123;
      String str2 = Integer.toString(number3);
      System.out.println(str2.length());



    }
}

/*
- It is non-primitive dt
- storing text in string format (very much used in java)
*/