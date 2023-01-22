public class CheckPalindrome {
    static int num = 0;
    static int checkNo(int n){
        if(n==0){
            return 0;
        }
        int a = n%10;
        num =num*10 + a;
        checkNo(n/10);
        return num;
    }
    public static void main(String[] args) {
        int n = 151;
        int result = checkNo(n);
        String res = (n==result) ? "Palindrome" : "not a Palindrome";
        System.out.println(res);

    }
}
