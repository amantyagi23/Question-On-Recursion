public class PowerOfTwo {
    static boolean Numberchecker(int num){
        if(num==2){
            return true;
        }
        
        if(num%2!=0){
            return false;
        }
        
        return Numberchecker(num/2);
        
        
       
       
         
    }
    public static void main(String[] args) {
        int num = 16;
        System.out.println(Numberchecker(num));
    }
}
