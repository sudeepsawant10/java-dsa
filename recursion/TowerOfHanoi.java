class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        //base condition
        if (n == 1){
            System.out.println("Moving disk "+n+" from "+ src+" to "+dest);
            return;
        }
        //move n-1 disks to helper from source using dest as helper
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Moving disk "+n+" from "+ src+" to "+dest);
        //move n-1 disk from helper to dest using src as helper
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String args[]) {
        int n=3;
        towerOfHanoi(n,"S", "H", "D");
    }
}