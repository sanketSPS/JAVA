public class TestPerson {
    public static void main(String[] args) {
        Person person1=new Person("Sanket",24);
        Person person2=new Person("Sanket",26);

        if (person1.equals(person2))
        {
            System.out.println("Equals");
        }
        else System.out.println("Not equals");

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
