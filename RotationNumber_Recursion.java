import java.util.Scanner;

public class RotationNumber_Recursion {
    static int Countdigit(int num){
        if(num==0){
            return 0;
        }

        return Countdigit(num/10)+1;
    }
    static int RotateNumber(int num ,int d,int result){
        if(d==0){
            int a =Countdigit(num);
            
            result = ((int)Math.pow(10, a))*result + num;
            return result;
        }
        return RotateNumber(num/10, d-1 , result*10+num%10);
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be rotated : ");
        int num = scan.nextInt();
        System.out.print("Enter the number of rotation digit : ");
        int d = scan.nextInt();
        int res = RotateNumber(num,d,0);
        System.out.println(res);
        scan.close();
        // System.out.println(((int)Math.pow(10, 2)));
    }
}
