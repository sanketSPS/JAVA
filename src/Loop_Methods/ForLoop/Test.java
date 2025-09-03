package ForLoop;
class Test {
    public static void main(String[] args) {
        System.out.println("Main start");
        point(1);
        System.out.println("Main end");
    }

    public static void point(int a){
        System.out.println(a);
        a++;
//        for (int i=1;i<=9;i++){
//            if (i==7){
//                //break;
//                //return;
//               continue;
//            }
//            System.out.println(i);
//        }
        if (a<10) point(a);
        return;
    }
}
