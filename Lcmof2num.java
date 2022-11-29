public class Lcmof2num {

    static int res = 1;

    static void hcfcaller(int a,int b,int i){
        if(b==i){
            return ; 
        }
        if(a%i==0 && b%i==0){
            res = i;
        }

        hcfcaller(a, b, i+1);
    }
    public static void main(String[] args) {
        int a =30;
        int b = 12;
       hcfcaller(a,b,1);
       System.out.println(res);
       int lcm = (a*b)/res;
       System.out.println(lcm);
    }
}
