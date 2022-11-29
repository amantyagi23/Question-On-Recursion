import java.util.ArrayList;

public class Newques2 {

    static ArrayList<String> boardsol(int row,int col,int endrow,int endcol){
        if(row == endrow && col==endcol){
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(row>endrow || col>endcol){
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        
    }
    
    public static void main(String[] args) {
        
    }
}
