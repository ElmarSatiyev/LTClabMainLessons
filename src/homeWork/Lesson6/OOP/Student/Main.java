package homeWork.Lesson6.OOP.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Elmar", "Sətiyev", 25, "Brown", 1.78, 70, "IT-101", "Male");
        student1.showInfo();

        Student student2 = new Student("Nazim", "Vəliyev", 26, "Blue", 1.76, 72, "IT-012", "Male");
        student2.showInfo();

    }
}
