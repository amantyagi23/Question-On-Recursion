public class FindReverse {
    static int sum=0;
    private static int reverse(int n){
        if(n==0){
            return 0;
        }
        int a = n%10;
        sum = sum*10 + a;
        reverse(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n = 12345;
        int result = reverse(n);
        System.out.println(result);
    }
}
