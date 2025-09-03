class ForLoop {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        String[] myArr= {"RAM","SHYAM","ABC","SOFD"};
        for (int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }

        //For Each Loop
        for(String name:myArr){
            System.out.println(name);
        }
    }
}
