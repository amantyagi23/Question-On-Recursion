import java.util.ArrayList;

public class PermutationString {
    static ArrayList<String> calller(String str){
        if(str.isEmpty()){
            
            return new ArrayList<>();
        }
        char cchr = str.charAt(0);
        String remain = str.substring(1);
        ArrayList<String> res = calller(remain); 
        ArrayList<String> result = new ArrayList<>();
        
        for (String string : result ) {
            result.add(string);
            result.add(remain);
            
        }
        return result;
    } 
    public static void main(String[] args) {

        String str = "abc";
        
        System.out.println(calller(str));
    }
}
