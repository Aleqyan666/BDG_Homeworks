package my_package;

public class Employee {
   static int  id;
   static String name;
   static String department;
   static int age;
   static String gender;


   //method ov porceci chstacvec
    public static void main(String[] args) {
        Employee tom = new Employee();
        System.out.println(tom.id = 56751);
        System.out.println(tom.name = "Tom");
        System.out.println(tom.department = "Engineering");
        System.out.println(tom.age = 25);
        System.out.println(tom.gender = "Male");

        System.out.println("=======================");
        Employee jim = new Employee();
        System.out.println(tom.id = 178252);
        System.out.println(tom.name = "Jim");
        System.out.println(tom.department = "Engineering");
        System.out.println(tom.age = 25);
        System.out.println(tom.gender = "Male");

        System.out.println("=======================");
        Employee jane = new Employee();
        System.out.println(tom.id = 598456);
        System.out.println(tom.name = "Jane");
        System.out.println(tom.department = "Data Science");
        System.out.println(tom.age = 38);
        System.out.println(tom.gender = "Female");
    }


}
