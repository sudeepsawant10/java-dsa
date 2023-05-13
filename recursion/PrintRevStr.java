class PrintRevStr {
    public static void printRevString(int l, String str) {
        if(l==0) {
            System.out.print(str.charAt(l));
            return;
        }
        System.out.print(str.charAt(l));
        printRevString(l-1, str);
    }
    public static void main(String args[]) {
        String str = "abcd";
        printRevString(str.length()-1, str);
    }
}