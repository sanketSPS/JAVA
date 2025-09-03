public class TestEmp {
    public static void main(String[] args) {
        Employee emp=new Employee("Sanket",25,5000);
        System.out.println(emp.getDetails());
        emp.setAge(27);
        System.out.println(emp.getDetails());
    }
}
