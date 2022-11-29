import java.util.Scanner;


    //    *
    //   ***
    //  *****
    // *******
    //*********
public class pramidpatternrec {
    static void line(int numofline){
        if(numofline==0){
            return ;
        }
        System.out.println();
        space(numofline);
        star(6-numofline);
        star(5-numofline);
        line(numofline-1);
    }
    static void star(int numofstar){
        if(numofstar==0){
            return ; 
        }
        star(numofstar-1);
        System.out.print("*");

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
