class ternary {
    public static void main(String[] args) {
        int a=41;
        int b=20;
        int c=30;
        int d=40;
        int Result= a>b ? (a>c ? (a>d?a:d) :(c>d?c:d)) : (b>c ? (b>d?b:d):(c>d?c:d));
        System.out.println(Result);

        boolean rain=true;
        String result=rain?"Take a car to office":"Take a bike to office";
        System.out.println(result);

        int x1=20;
        String sup = (x1 < 15) ? "s" : (x1 < 22)? "t" : "h";
        System.out.println(sup);

        int x = 5, y = 2, exp1 = 10;
        exp1 %= x + ( x > 6 ? ++y : --y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(exp1);


    }
}