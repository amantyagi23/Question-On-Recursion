public class PowerOfThree{
    static void  Numberchecker(int num){
        if(num==1){
            System.out.println("yes");
            return ;
        }
        
        else if(num%3!=0){
            System.out.println("No");
        }
        else{
        Numberchecker(num/3);
        }
        
       
       
         
    }
    public static void main(String[] args) {
        int num = 9;
        Numberchecker(num);
    }
}