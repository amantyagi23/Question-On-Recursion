public class pattern13 {
    static void Star(int j,int i){
        if(j==0){
            return ; 
        }
        if(i%2==0){
        System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        Star(j-1,i);
    }
    static void Line(int i){
        if(i==0){
            return ; 
        }
        
        Line(i-1);
        Star(i,i);
        System.out.println();
    }
    public static void main(String[] args) {
        Line(5);
    }
}
