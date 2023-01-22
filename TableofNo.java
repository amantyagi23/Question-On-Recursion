public class TableofNo {
    static void makeTable(int n,int i){
        if(i==11){
            return ;
        }
        System.out.println(n+"X"+i+"="+n*i);
        makeTable(n,i+1);
        
    }
    public static void main(String[] args) {
        int n= 5;
        makeTable(n,1);
    }
}
