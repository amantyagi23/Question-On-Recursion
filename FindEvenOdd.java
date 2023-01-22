import java.util.ArrayList;

public class FindEvenOdd {
    static ArrayList<Integer> evenlist = new ArrayList<>();
    static ArrayList<Integer> oddlist = new ArrayList<>();
    static void evenOdd(int n){
        if(n==0){
            return ; 
        }
        evenOdd(n-1);
        if(n%2==0){
            evenlist.add(n);
        }
        if(n%2!=0){
            oddlist.add(n);
        }
    }
    public static void main(String[] args) {
        evenOdd(50);
        System.out.print(evenlist+" "+oddlist);
    }
}
