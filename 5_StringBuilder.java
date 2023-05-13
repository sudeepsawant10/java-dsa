import java.util.*;

class StringBuilderEg{

    public static StringBuilder RevStr(StringBuilder str) {
        int start =0;
        int end = str.length() -1 ;

        // for(start=0; start<end/2; end--){
        //     char temp = str.charAt(end);
        //     str.setCharAt(end,  str.charAt(start));
        //     // str.charAt(end) = str.charAt(start);
        //     str.setCharAt(start, temp);
        //     start++;
        // }

        for(int i=0; i<str.length()/2; i++) {
            int front = i;
            int back = str.length()-1 -i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        return str;
    }
    
    public static void main(String args[]) {
        //declare
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //print char at index 0
        System.out.println(sb.charAt(0));

        //set char at index (replace)
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //Pony => STony using insert
        sb.setCharAt(0, 'T'); //replacing
        sb.insert(0, 'S');  //adding
        sb.insert(3, 'n');  //adding
        System.out.println(sb);


        //delete char exclusive end
        sb.delete(3,4);
        System.out.println(sb);

        //append => add at end
        sb.append(" Stark");
        System.out.println(sb);
        System.out.println(sb.length());

        StringBuilder original =  new StringBuilder("peedus");
        StringBuilder reversed = RevStr(original);
        System.out.println(reversed);


    }
}



/*
String Builder
- String immutable
- cannot delete and add (so we have to make new string) which is time taking
- So more optimise string class came which is StringBuilder (add, delete and other operations without taking time) 



*/