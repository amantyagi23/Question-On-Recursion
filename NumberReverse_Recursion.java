public class NumberReverse_Recursion {
    static int revseNumber(int num,int result){
        if(num==0){
            return result;
        }
        return revseNumber(num/10,(result*10+num%10));

       
    }
    public static void main(String[] args) {
        int num = 12345;
        int res = revseNumber(num,0);
        System.out.println(res);
    }
}
