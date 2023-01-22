public class CountDigits {
    static int count(int n){
        if(n==0){
            return 0;
        }
        return count(n/10)+1;
    }
    public static void main(String[] args) {
        int n = 3452345;
        int result = count(n);
        System.out.println(result);
    }
}
