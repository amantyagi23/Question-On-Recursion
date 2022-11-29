public class pattern17 {
    static void Star(int numberofstar,int numberofline){
        if(numberofstar==0){
            return ; 
        }
        if(numberofline==5||numberofstar==5||numberofline==1||numberofstar==1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        Star(numberofstar-1,numberofline);
    }
    static void Line(int numberofline,int constantvalue){
        if(numberofline==0){
            return ; 
        }
       
        Line(numberofline-1,constantvalue);
        Star(constantvalue,numberofline);
        System.out.println();
    }
    public static void main(String[] args) {
        Line(5,5);
    }
}
