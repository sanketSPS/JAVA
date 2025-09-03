package WhileLoop;

class Functions {
    public static void main(String[] args) {
        pattern();
        System.out.println();
        pattern1();
    }

    public static void pattern() {
        int a = 0;
        while (a < 5) {
            System.out.print("*");
            int b = 0;
            while (b < a) {
                System.out.print(" *");
                b++;
            }
            System.out.println();
            a++;
        }
    }

    public static void pattern1() {
        int a = 0;
        while (a < 5) {
            System.out.print("*");
            int b = 4;
            while (b > a) {
                System.out.print(" *");
                b--;
            }
            System.out.println();
            a++;
        }
    }

}