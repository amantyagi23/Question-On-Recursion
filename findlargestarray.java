public class findlargestarray {
    static int larger = Integer.MIN_VALUE;
    static int largestarr(int[] arr, int len){
        if(len==-1){
            return 0;
        }
        System.out.println(arr[len]);
        if(larger<=arr[len]){
            larger = arr[len];
        }
        largestarr(arr, len-1);
        return larger;
    }
    public static void main(String[] args) {
        int[] arr = {0,-8,-7,-2,-1};
        // System.out.println(arr.length);
        int res = largestarr(arr,arr.length-1);
        System.out.println("Largest in array is "+res);
    }
}
