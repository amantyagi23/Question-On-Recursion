public class pattern11 {
    static void Star(int numberofstar,int numberofline){
        if(numberofstar==0){
            return ; 
        }
        Star(numberofstar-1,numberofline);
        System.out.print(numberofline);
        
        

    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        Star(numberofline,numberofline);
        System.out.println();
        
        Line(numberofline-1);
        
    }
    public static void main(String[] args) {
      Line(5);
}
}
