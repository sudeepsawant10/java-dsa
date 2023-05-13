class SubSequenceStr {
//Time complexity O(2^n)
    public static void subSequences(String str, int idx, String newStr) {
        if(str.length() == idx) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        // to be (choices)
        //if we add again we have to delete it in in second case
        // so call next level with including currChar
        subSequences(str, idx+1, newStr+currChar);


        //or not to be
        subSequences(str, idx+1, newStr);

    }


    public static void main(String args[]) {
        String str = "abc";
        subSequences(str, 0, "");
    }
}