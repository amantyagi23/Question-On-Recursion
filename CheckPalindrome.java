public class CheckPalindrome {
    static int num = 0;
    static int count(int n){
        if(n==0){
            return 0;
        }
        return count(n/10)+1;
    }
    static int checkNo(int n,int count){
        if(n==0){
            return 0;
        }
        int a = n%10;
        num =num+ (int)Math.pow(a,count);
        checkNo(n/10,count);
        return num;
    }
    public static void main(String[] args) {
        int n = 1633;
        int result = checkNo(n,count(n));
        String res = (n==result) ? "palindrome" : "not a palindrome";
        System.out.println(res);

    }
}
