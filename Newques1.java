import java.util.ArrayList;

// Board and dice problem

public class Newques1 {
    static ArrayList<String> boarddice(int source, int target){
        if(source==target){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(source>target){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finalres = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            int crrval = source +i;
            ArrayList<String> list = boarddice(crrval, target);
            for (String temp : list) {
                finalres.add(temp+i);
            }
            
        }

        return finalres;

    }
    public static void main(String[] args) {
        System.out.println(boarddice(0, 10 ));
    }
}
