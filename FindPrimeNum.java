public class FindPrimeNum {
    static boolean checkprime(int n,int i){
        if(n==i){
            return true; 
        }
        if(n%i==0){
            return false;
        }

        return checkprime(n, i+1);
    }
    public static void main(String[] args) {
        int n = 1019;
        System.out.println(checkprime(n,2));
    }
}
