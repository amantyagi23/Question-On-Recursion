public class CountZeros {
    static int checkZero(int n, int count){
            if(n==0){
                return count;
            }
            if(n%10==0){
                count = count+1;
            }
            return checkZero(n/10 ,count);
        }
    public static void main(String[] args) {
        int n = 1023001;
        int res = checkZero(n,0); 
        System.out.println(res);
    }
}
