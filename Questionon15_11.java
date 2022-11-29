public class Questionon15_11 {
   
    static String Strchanger(String str, int len ,int index){

        if(len==index){
            return "";
        }
        if(str.charAt(index)== 'p' && str.charAt(index+1)=='i'){
            return "3.14" + Strchanger(str, len, index+2);
        }
        else { 
           return str.charAt(index) + Strchanger(str, len, index+1);
        }
        
        
    }
    public static void main(String[] args) {
        String str = "2 + pi * 6 * pi - pi";
        String Duplicate = Strchanger(str,str.length(),0); 
        System.out.println(Duplicate);
    }
}
