import java.util.ArrayList;

public class NewQuestion {
    static ArrayList<Integer> Digcount(int arr[],int len,int index,int serelement){
        if(len==index){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> arrayList = Digcount(arr, len, index+1,serelement);
        if(arr[index]==serelement){
            arrayList.add(index);
        }
        return arrayList;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,6,4,2};
        System.out.println(Digcount(arr,arr.length-1,0,2));
    }
}
