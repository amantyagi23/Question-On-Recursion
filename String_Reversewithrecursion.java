public class String_Reversewithrecursion {

    static String Str_Reverse(String Str){

        if (Str.isEmpty()) {
            return "";
        }
        String s = Str.substring(1);
        System.out.println(s);
        Str_Reverse(s); 
        return (s+Str.charAt(0));
    }
    public static void main(String[] args) {
        String str = "absd";
        String Str1 = Str_Reverse(str);
        System.out.println(Str1);

    }
}
