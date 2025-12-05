package homeWork.Lesson6.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);


        book1.setTitle("The Lord of the Rings");


        book2.showInfo();

    }
}
