import java.util.ArrayList;

public class factor {
    static ArrayList<Integer> list = new ArrayList<Integer>();

    static void factorofnum(int num,int i){
        if(num==i){
            return ; 
        }
        
        factorofnum(num,i+1);
        System.out.println(i);
        if(num%i==0){
            list.add(i);
        }

    }
    public static void main(String[] args) {
        factorofnum(37,1);
        System.out.println(list);
    }
}
