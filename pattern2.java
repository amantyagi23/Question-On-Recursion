public class pattern2 {
    static void Star(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        if(numberofstar%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        Star(numberofstar-1);
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        Star(5);
        System.out.println();
        Line(numberofline-1);
    }
    public static void main(String[] args) {
        Line(5);
    }
}
