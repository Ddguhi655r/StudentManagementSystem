public class Student extends Person {

    private Course course;

    public Student(String name, String id, Course course) {
        super(name, id);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + getId());
        System.out.println("Course: " + course.getCourseName());
    }
}