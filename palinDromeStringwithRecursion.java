public class palinDromeStringwithRecursion {
    static String Str_Reverse(String Str){

        if (Str.isEmpty()) {
            return "";
        }
        String s = Str.substring(1);
        Str_Reverse(s); 
        System.out.println(s+Str.charAt(0));
        return (s+Str.charAt(0));
    }
    static boolean palinString(String str){
        String Str1 = Str_Reverse(str);
        System.out.println(Str1);
        
        if(Str1.equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "lolol";

        if(palinString(str)){

            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
