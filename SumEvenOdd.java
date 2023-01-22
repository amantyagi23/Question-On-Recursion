public class SumEvenOdd {
    static int[] result = {0,0};
    static void evenOdd(int n){
        if(n==0){
            return ; 
        }
        evenOdd(n-1);
        if(n%2==0){
            result[0] = result[0] + n;
        }
        if(n%2!=0){
            result[1] = result[1] + n;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        evenOdd(n);
        System.out.println("Even Sum :" +result[0]);
        System.out.println("Odd Sum :" +result[1]);
    }
}
