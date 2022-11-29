public class Starchanger {
    static String Strchanger(String str, int len ,int index){

        if(len==index){
            return "";
        }
        if(str.charAt(index)==str.charAt(index+1)){
            return str.charAt(index)+"*"+str.charAt(index+1) + Strchanger(str, len, index+2);
        }
        else { 
           return str.charAt(index) + Strchanger(str, len, index+1);
        }
        
        
    }
    public static void main(String[] args) {
        String str = "abbcaadd";
        String Duplicate = "";
        if(str.length()%2==0){
            Duplicate= Strchanger(str,str.length(), 0);
        }
        else{
            Duplicate = Strchanger(str,str.length()-1,0); 
        }
        System.out.println(Duplicate);
    }
}
