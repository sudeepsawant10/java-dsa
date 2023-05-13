class KeyPadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    //combination=>newStr
    public static void printCombinations(String str, int idx, String combination){
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];//2-0=2 = "def"

        for(int i=0; i<mapping.length(); i++){
            //add mapping in combination
            printCombinations(str, idx+1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        String str = "45";
        printCombinations(str, 0, "");
    }
}