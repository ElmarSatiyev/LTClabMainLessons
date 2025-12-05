package homeWork.Lesson6.OOP.Student;

public class Student {
    public String firstName;
    public String lastName;
    public int age;
    public String eyeColor;
    public double height;
    public double weight;
    public String group;
    public String gender;


    public Student(String firstName, String lastName, int age, String eyeColor,
                   double height, double weight, String group, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
        this.group = group;
        this.gender = gender;
    }


    public void showInfo() {
        System.out.println("-----------------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Group: " + group);
        System.out.println("Gender: " + gender);
        System.out.println("-----------------------------------");
    }
}
