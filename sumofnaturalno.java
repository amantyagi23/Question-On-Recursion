public class sumofnaturalno {
    static int sum = 0;
    static void sumcaller(int num){
        if(num==0){
            return ;
        }
        sum = sum+num;
        sumcaller(num-1);
        
    }
    public static void main(String[] args) {
        int num = 10;
        sumcaller(num);
        System.out.println(sum);
    }
}
