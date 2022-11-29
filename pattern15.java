public class pattern15 {
    static void Star(int j, int i) {
        if (j == 0) {
            return;
        }

        Star(j - 1, i);
        System.out.print(j);
    }

    static void R_star(int k) {
        if (k == 0) {
            return;
        }

        R_star(k - 1);
        System.out.print(k);
    }

    static void Line(int i) {
        if (i == 0) {
            return;
        }

        Line(i - 1);
        Star(i, i);
        System.out.println();
    }

    static void R_Line(int i) {
        if (i == 0) {
            return;
        }
        R_star(i);
        System.out.println();

        R_Line(i - 1);

    }

    public static void main(String[] args) {
        Line(5);
        R_Line(4);
    }
}
