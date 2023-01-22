import java.util.ArrayList;

public class FibonacciSeries{
    static ArrayList<Integer> storefibDigits = new ArrayList<>();
    static void findFib(int n , int a, int b){
        if(n==0){
            return ; 
        }
        int c = a+b;
        storefibDigits.add(a);
        findFib(n-1,b ,c);
    }
    public static void main(String[] args) {
        int n = 10;
        findFib(n,0,1);
        System.out.println(storefibDigits);
    }
}