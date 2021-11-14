public class Main {

    public static void main(String[] args) {
        Instructor instructor=new Instructor();
        instructor.setInstructorFirstName("Engin");
        instructor.setInstructorLastName("Demirog");
        Student student=new Student();
        student.setStudentFirstName("Ercan");
        student.setStudentLastName("Kaya");
        String[] courses={"JAVA","REACT"};
        student.setCourses(courses);
	    User user=new User();
	    user.setUserName("ErcanKya");
        UserManager userManager=new UserManager();
        userManager.addUser(user);
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addInstructor(instructor);
        StudentManager studentManager=new StudentManager();
        studentManager.addStudent(student);

    }
}
