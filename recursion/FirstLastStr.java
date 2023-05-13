class FirstLastStr {
    public static int first =-1;
    public static int last =-1;
    public static void findOccurance(int idx, String str, char ele) {
         if(str.length() == idx){
             System.out.println(first);
             System.out.println(last);
            return;
        }
        if(ele == str.charAt(idx)) {
            if(first == -1){
                //character found first time in a string
                first = idx;
            }
            else {
                //first time already found update last
                last = idx;
            }
        }

        findOccurance(idx+1, str, ele);
       
    }
    public static void main(String args[]) {
        String str = "kkkabaacdaefaaha";
        findOccurance(0, str, 'a');
    }
}