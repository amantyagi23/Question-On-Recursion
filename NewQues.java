import java.util.ArrayList;



public class NewQues {
    

    static ArrayList<String> calller(String str,int len,int index){
        if(str.isEmpty()){
            return new ArrayList<>();
        }
        char cchr = str.charAt(0);
        String remain = str.substring(1);
        ArrayList<String> res = calller(remain, len, index+1);  
        
        res.add(cchr+"");
        // res.add(remain+""+cchr);
        while (!remain.isEmpty()) {
            res.add(cchr+remain+"");
            remain = remain.substring(1);
        }
        return res;
    } 

    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list =  calller(str,4,0);
        System.out.println(list);
        
    }
}
