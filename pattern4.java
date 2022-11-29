public class pattern4 {
    static void Star(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        if(numberofstar==1||numberofstar==5){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        Star(numberofstar-1);
    }
    static void Star_1(int numberofstar){
        if(numberofstar==0){
            return ;
        }
       System.out.print("1");
        Star_1(numberofstar-1);
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        if(numberofline==1||numberofline==5){
            Star_1(5);
        }
        else{
            Star(5);
        }
        
        System.out.println();
        Line(numberofline-1);
    }
    public static void main(String[] args) {
        Line(5);
    }
}
