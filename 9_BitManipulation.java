class BitManipulation{
    public static void main(String args[]) { 
       //1. get bit
    //    int n = 5;
    //    int pos = 3;
    //    int bitMask = 1<<pos;

    //    if((bitMask & n) == 0){
    //        System.out.println("Bit was 0.");
    //    }
    //    else {
    //        System.out.println("Bit was 1.");
    //    }

        // 2. Set bit
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;
        // int newNum = bitMask | n;
        // System.out.println(newNum);


        // // 3. Clear bit
        // int n = 5;
        // int pos = 2;
        // int bitMask = ~(1<<pos);
        // int newNum = bitMask & n;
        // System.out.println(newNum);

        // // 4. Update bit
        int n = 5;  //0101 =>0111
        int pos = 1;
        int opr = 1; //set opration 1 or clear opration 0
        int bitMask = 1<<pos;

        if(opr == 1) {
            //set
            //clear
            int newNum = bitMask | n;
            System.out.println(newNum);
            
        }
        else {
            int notBitMask = ~bitMask;
            int newNum = bitMask & n;
            System.out.println(newNum);
        }
        
    }
}

/*
Bit Manipulation
1 = High state
0 = Low state
- for reducing time complexity of algorithms
- for competative programming in depth

1. Left Shift
    N<<1
    2<<1
    010<<1
    =100

2. Right Shift
    N>>1
    2>>1
    010<<1
    =001

Major Operations
1. Getbit
2. Setbit (making one)
3. Clear (making zero)
4. Update

eg. 01001000
    76543210

Q1. Get the 3rd bit (position = 2) of a number n. (n=0101)
Right to left
    0101
    3210
Process:
Bit Mask = 1<<i (operations)(Additional number is used)
Operation: And
eg. n = 0101
Mask: 1<<2
    0001<<2
    ----
    0100 

    0100 And (&)
    0101
    ----
    0100 
3rd bit = 1


2. Set bit (position = 1) of a number n = 0101
Bit mask = 1<<i
Operations = OR
Mask: 1<<1
    0002<<1
    0010

Operation 0010 OR
          0101
          ----
          0111  (converting 5 to 7)


3. Clear bit 3rd bit (position = 2) of a number n = 0101
Bit mask = 1<<i
Operations = AND WITH NOT
Mask: 1<<2
    0001<<2
    0100

Operation :
1. First find not of bit mask  
 ~0100 =  1011  AND
          0101
          ----
          0001 (converting 5 to 1)


4. Update bit 2nd bit (position = 1) of a number n to 1 = 0101
Two Options:
1. For 0
Bit mask = 1<<i
Operations = AND WITH NOT


2. For 1
Bit mask = 1<<i
Operations = OR


Mask: 1<<1
    0001<<1
    0010

Operation :
          0011  or
          0101
          ----
          0111 (converting 5 to 7)
*/