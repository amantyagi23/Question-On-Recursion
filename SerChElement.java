public class SerChElement {
    static int counti=0;
    static int[] Digcount(int arr[],int len,int index,int serelement){
        if(len==index){
            return new int[len];
        }
        int[] arrayList = Digcount(arr, len, index+1,serelement);
        if(arr[index]==serelement){
            arrayList[counti] = index;
            counti++;
        }
        return arrayList;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6,4,2};
       int [] arr2= (Digcount(arr,arr.length-1,0,2));

       for (int i : arr2) {
        System.out.println(arr2[i]);
       }
    }
}
