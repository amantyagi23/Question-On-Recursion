import java.util.Scanner;

public class Hollowrecursion {
    static void line(int numofline){
        if(numofline==0){
            return ;
        }
        System.out.println();
        space(numofline);
    
        star(5,numofline);
        line(numofline-1);
    }
    static void star(int numofstar,int numberofline){
        if(numofstar==0){
            return ; 
        }
        if(numofstar==1||numofstar==5||numberofline==1||numberofline==5){
        System.out.print("*");

        }
        else{
            System.out.print(" ");
        }
        star(numofstar-1,numberofline);
    }
    static void space(int numofspace){
        if(numofspace==0){
            return;
        }
        System.out.print(" ");
        space(numofspace-1);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = scan.nextInt();
       line(n);
        scan.close();
    }
}
