public class sumofdigitrecursion {
    static int countdigit(int num){
        if(num==0){
            return 0;
        }

        return countdigit(num/10)+num%10;
    }
    public static void main(String[] args) {
        int res = countdigit(123456);
        System.out.println(res);
    }
}
