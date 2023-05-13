class MoveX{

    public static void moveXAtEnd(String str, int idx, int count, String newStr){
        //if str index reached at last
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        //check if char is x
        if(str.charAt(idx) == 'x') {
            //count it to add in newstring
            count+=1;
            moveXAtEnd(str, idx+1, count, newStr);
        }
        else{
            //add not x char in newStr
            newStr += str.charAt(idx);
            moveXAtEnd(str, idx+1, count, newStr);
            
        }
    }

    public static void main(String args[]) {
        String str = "axxxxxxxb";
        // for(int i=0; i<=8;i++) {
        //     System.out.println(str.charAt(i));
        // }
        // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 7
        moveXAtEnd(str, 0, 0, "");
    }
}