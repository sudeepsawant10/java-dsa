class Operators{
    public static void main(String args[]) { 
        int a= 10;
        int b = 0;

        //pre increment
        System.out.println("Pre Increment: ");
        System.out.println("a = "+a + " b = "+b);
        b=++a;
        System.out.println(a);
        System.out.println(b);

        //post increment
        System.out.println("Post Increment: ");
        a= 10;
        b = 0;
        System.out.println("a = "+a + " b = "+b);
        b=a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = "+a + " b = "+b);

         //pre decrement
        System.out.println("Pre Decrement: ");
        a= 10;
        b = 0;
        System.out.println("a = "+a + " b = "+b);
        b=--a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = "+a + " b = "+b);

         //Post decrement
        System.out.println("Post Decrement: ");
        a= 10;
        b = 0;
        System.out.println("a = "+a + " b = "+b);
        b= a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a = "+a + " b = "+b);

    }
}

/*

unary ++, --
Binary = +, -, *, /, %

1. Pre Increment
++a //first change value then use value


2. Post Increment
a++ //first use value then change value

******** Relational Operator  => ==, !=, >, <, >=, <=
- gives output as boolean value in java

Logical Operators = > &&(And), ||(Or), !(Not)
- logical statments
a=10, b=20, c=30
if(a<b && b<c)

Logical Or
- checks first true condition and executes the blocks

Logical Not
if (!(a<b))
- imp for logics

********** Bitwise Operators (imp for bit manupulations)
eg. A=0101 , B=0110, True = 1, False = 0
if output of condition is not zero then sometimes it is consider as true
1. Binary And=> &
    0101
    0110
    -----
    0100

2. Binary Or=>  |
    0101
    0110
    -----
    0111

3. Binary Xor=> ^   (similar then false otherwise true)
    0101
    0110
    -----
    0011
4. Binary And=> ~ (compliment)
    0101
    -----
    1010

5. Binary Left Shift => <<  (zero in empty places)
syntax = number, operator , operation
eg. A<<1

    11001100
    --------
    10011000
    

4. Binary Right Shift => >>
eg. A>>1
    0101
    -----
    0010

- useful all oprations for logically programmming
- useful in dp for less space requirements

************ Assignments oprators
=, +=, -=, *=, /= and %=
*/