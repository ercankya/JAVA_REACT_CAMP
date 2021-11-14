public class Instructor extends User{
    private String instructorFirstName;
    private String instructorLastName;
    private String[] courses;

    public Instructor() {
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
