class IsSortedArr {
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length - 1){
            //we reach at last index
            return true;
        }
        // if(arr[idx] < arr[idx+1]){
        //     //arr is sorted till now check next level and return to this
        //     return isSorted(arr, idx+1);
        // }
        // else {
        //     return false;
        // }

        //OPTIMISED VERSION
        if(arr[idx] >= arr[idx+1]){
            return false;
        }
        else{
            return isSorted(arr, idx+1);
        }
    }

    public static void main(String args[]) {
        int numbers[]= {1,2,3,3};
        System.out.println("isSorted numbers = "+isSorted(numbers,0));
    }
}