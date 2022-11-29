public class DiamondPatternwithrecursion {
        static void line(int numofline){
            if(numofline==0){
                return ;
            }
            System.out.println();
            space(numofline);
            star(6-numofline);
            star(5-numofline);
            line(numofline-1);
        }
        static void space(int numofspace){
            if(numofspace==0){
                return;
            }
            System.out.print(" ");
            space(numofspace-1);
        }
        static void Revseline(int numofline){
            if(numofline==0){
                return ;
            }
            Revseline(numofline-1);
            revsespace(numofline+1);
            star(5-numofline);
            star(4-numofline);
            System.out.println();
        }
        static void star(int numofstar){
            if(numofstar==0){
                return ; 
            }
            star(numofstar-1);
            System.out.print("*");
        }
        
        static void revsespace(int numofspace){
            if(numofspace==0){
                return;
            }
            revsespace(numofspace-1);
            System.out.print(" ");
        }
        public static void main(String[] args) {
            line(5);
            // System.out.println("\n\n\n\n");
            System.out.println();
            Revseline(4);
        }
}
