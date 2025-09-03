class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "My name is:"+name+" Age is:"+age;
    }

    public static void main(String[] args) {
        Student s1=new Student("Sanket",23);
        System.out.println(s1.toString());
    }
}
