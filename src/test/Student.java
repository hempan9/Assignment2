package test;

public class Student {
    private int studentId;
    private String studentName;
    private char studentStatus;
    public Student(){
        studentId = 10;
        studentName = "Ram Hari";
        studentStatus = 'F';
    }
   public Student(int studentId, String studentName, char studentStatus){
        this.studentId =studentId;
        this.studentName =studentName;
        this.studentStatus = studentStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(char studentStatus) {
        this.studentStatus = studentStatus;
    }
}
