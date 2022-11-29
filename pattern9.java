public class pattern9 {
    static void Star(int numberofstar){
        if(numberofstar==0){
            return ; 
        }
        Star(numberofstar-1);
        System.out.print(numberofstar);

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
