import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    private String courseName;
    private final List<Instructor> instructors;
    private final List<Textbook> textbooks;

    public Course(String courseName) {
        setCourseName(courseName);
        instructors = new ArrayList<>();
        textbooks = new ArrayList<>();
    }

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this(courseName);
        addInstructor(instructor);
        addTextbook(textbook);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be blank.");
        }
        this.courseName = courseName.trim();
    }

    public List<Instructor> getInstructors() {
        return Collections.unmodifiableList(instructors);
    }

    public List<Textbook> getTextbooks() {
        return Collections.unmodifiableList(textbooks);
    }

    public void addInstructor(Instructor instructor) {
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null.");
        }
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        if (textbook == null) {
            throw new IllegalArgumentException("Textbook cannot be null.");
        }
        textbooks.add(textbook);
    }

    public void print() {
        System.out.println("Course: " + courseName);

        System.out.println("Instructors:");
        for (int i = 0; i < instructors.size(); i++) {
            Instructor instructor = instructors.get(i);
            System.out.printf("  %d. %s, Office %s%n",
                    i + 1,
                    instructor.getFullName(),
                    instructor.getOfficeNumber());
        }

        System.out.println("Textbooks:");
        for (int i = 0; i < textbooks.size(); i++) {
            Textbook textbook = textbooks.get(i);
            System.out.printf("  %d. %s by %s (%s)%n",
                    i + 1,
                    textbook.getTitle(),
                    textbook.getAuthor(),
                    textbook.getPublisher());
        }
    }
}
