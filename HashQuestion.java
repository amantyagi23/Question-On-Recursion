import java.util.HashMap;

public class HashQuestion {
    static HashMap<Character,Integer> map = new HashMap<>();

    static void frcounter(String name,int len,int index){
        if (index==len) {
            return ;
        }
        char s = name.charAt(index);
        if(map.get(s)==null){
            map.put(s, 1);
        }
        else{
            int count = map.get(s);
            map.put(s, count+1);
        }
        frcounter(name,len,index+1);
    }

    
    public static void main(String[] args) {

        String name = "ram kumar";

        frcounter(name,name.length(),0);
        System.out.println(map);
       


    }
}
