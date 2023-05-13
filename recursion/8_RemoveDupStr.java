class RemoveDuplicateStr {
    public static boolean[] map = new boolean[26];
    //map is common for all the functions so sw don't require parameter
    //boolean type always store false by default
    public static void printMap(){
        for(int i=0; i<25; i++){
            System.out.println(map[0]);
        }
    }
    public void removeDupStr(String str, int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        //if already true(element found) then call next level
        // char currChar = str.charAt(idx);
        if(map[str.charAt(idx)-'a']) {
            removeDupStr(str,idx+1,newStr);
        }   
        else {
            //found first time add into string and make it true
            newStr+=str.charAt(idx);
            map[str.charAt(idx) - 'a'] = true;
            removeDupStr(str, idx+1, newStr);
        }
    }

    public static void main(String args[]) {
        String str = "abbcccda";
        char currChar = 'b';
        if(map[currChar-'a']){
            System.out.println(map[currChar-'a']);
        }
        // printMap();
        RemoveDuplicateStr obj = new RemoveDuplicateStr();
        obj.removeDupStr(str,0,"");
        // printMap();
    }
}