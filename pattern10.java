public class pattern10 {
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
        
        Line(numberofline-1);
        Star(numberofline);
        System.out.println();
    }
    public static void main(String[] args) {
      Line(5);
}
}
