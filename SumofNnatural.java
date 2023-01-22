public class SumofNnatural {
    static int sumFind(int n){
        if(n==0){
            return 0;
        }
        return sumFind(n-1)+n;
    }
   public static void main(String[] args) {
        System.out.println(sumFind(15));
    }
}
