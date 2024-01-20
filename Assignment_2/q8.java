package Assignment_2;

public class q8 {
    private String name;
    private int age;

    public q8(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        q8 student1 = new q8("Ankush Dutta", 20);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
    }
}

