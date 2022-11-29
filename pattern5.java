public class pattern5 {
    static void Star(int numberofstar ,int numberofline){
        if(numberofstar==0){
            return ; 
        }
        if(numberofstar==3||numberofline==3){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        Star(numberofstar-1,numberofline);
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        Star(5,numberofline);
        System.out.println();
        Line(numberofline-1);
    }
    public static void main(String[] args) {
        Line(5);
    }
}
