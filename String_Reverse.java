public class String_Reverse{
    public static void main(String[] args) {
        String str = "Hello Everyone My name is Ram Kumar Sharma";

        String[] str1 = str.split(" ");
        System.out.println(str);
        System.out.println();
        str = "";
        for (int i = str1.length-1 ; i >=0; i--) {
            str = str + str1[i] + " " ;
        }

        System.out.println(str);
        
        
        
    }
}