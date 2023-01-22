public class PowerofN {
    static int findPow(int b ,int n){
        if(n==0){
            return 1;
        }
        return findPow(b, n-1)*b;
    }
    public static void main(String[] args) {
        int result = findPow(5,2);
        System.out.println(result);
    }
}
