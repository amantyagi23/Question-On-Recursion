public class palinDromeNumberwithRecursion {
    
    static int revseNumber(int num,int result){
        if(num==0){
            return result;
        }
        
        return revseNumber(num/10,(result*10+num%10));
        
    }
    
    static void palinCaller(int num){
        if(num==10){
            return ;
        }
        
        palinCaller(num-1);
        if(num == revseNumber(num,0)){
            System.out.println(num + " is a palindrome number");
        }     
    }

    public static void main(String[] args) {
        int num = 121;
        palinCaller(num);
    }
}
