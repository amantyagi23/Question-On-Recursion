public class pattern3 {
    static void Star(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        System.out.print("1");
        Star(numberofstar-1);
    }
    static void Star_0(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        System.out.print("0");
        Star_0(numberofstar-1);
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        if(numberofline%2==1){
            Star(5);
        }
        else{
            Star_0(5);
        }
        System.out.println();
        Line(numberofline-1);
    }
    public static void main(String[] args) {
        Line(5);
    }
}
