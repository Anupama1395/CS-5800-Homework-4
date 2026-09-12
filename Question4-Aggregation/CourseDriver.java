public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor1 =
                new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructor2 =
                new Instructor("Anita", "Patel", "3-2640");

        Textbook textbook1 =
                new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Textbook textbook2 =
                new Textbook("Effective Java", "Joshua Bloch", "Addison-Wesley");

        Course course = new Course("CS 5800 Advanced Software Engineering",
                instructor1, textbook1);

        course.addInstructor(instructor2);
        course.addTextbook(textbook2);

        System.out.println("COURSE INFORMATION");
        System.out.println("==================");
        course.print();
    }
}
