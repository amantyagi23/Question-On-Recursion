public class pattern6 {
    static void Star(int numberofstar,int numberofline){
        if(numberofstar==0){
            return ; 
        }
       
        Star(numberofstar-1,numberofline);
        System.out.print(numberofstar+","+numberofline+"  ");
    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        
        
        Line(numberofline-1);
        Star(5,numberofline);
        System.out.println();
    }
    public static void main(String[] args) {
        Line(5);
    }
}
