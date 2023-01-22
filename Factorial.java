public class Factorial {
    private static int Fact(int n) {
        if(n==1){
            return 1;
        }
        return Fact(n-1)*n;
    }
    public static void main(String[] args) {
       int result = Fact(10);
       System.out.println(result);
    }

    
}
