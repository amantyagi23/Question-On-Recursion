public class pattern12 {
    static void Star(int numberofstar,int numberofline){
        if(numberofstar==0){
            return ; 
        }

        System.out.print(numberofline);
        Star(numberofstar-1,numberofline);
        
        
        

    }
    static void Line(int numberofline){
        if(numberofline==0){
            return ; 
        }
        
        Line(numberofline-1);
        Star(numberofline,numberofline);
        System.out.println();
    }
    public static void main(String[] args) {
      Line(5);
}
}
