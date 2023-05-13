class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "new School";
    }
}

public class StaticEg {
    public static void main(String args[]) {
        Student.school = "JVM";
        Student student1 = new Student();
        student1.name="Tony";
        // student1.school="ABC";
        System.out.println(student1.name);
        System.out.println(student1.school);
    }
}