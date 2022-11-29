public class pattern8 {
    static void Star(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        System.out.print(numberofstar);
        Star(numberofstar-1);
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        Star(numberofline);
        System.out.println();
        Line(numberofline-1);
    }
    public static void main(String[] args) {
        Line(5);
    }
}
