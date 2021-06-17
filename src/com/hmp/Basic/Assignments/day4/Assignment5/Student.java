package com.hmp.Basic.Assignments.day4.Assignment5;

public class Student {
    int studentId;
    char studentType;
    String studentName;
    Student(){
        studentId++;
    }
    Student(int id, char type, String name){
        studentId = id;
        studentType = type;
        studentName = name;
    }
}
class PostGradStudent extends Student{
    int postCourseId;
    String postCourseName;
    int postCourseFees;
    public PostGradStudent(int postCourseId, String postCourseName, int postCourseFees
    , int id, char type, String name){
        super(id,type,name);
        this.postCourseId = postCourseId;
        this.postCourseName = postCourseName;
        this.postCourseFees = postCourseFees;
    }

    public int getPostCourseId() {
        return postCourseId;
    }

    public String getPostCourseName() {
        return postCourseName;
    }
}
class DayScholar extends PostGradStudent{
    private String residentialAddress;
    public DayScholar(int postId, String postCOurse, int postFees,int id, char type
    , String name, String residentialAddress){
    super(postId,postCOurse,postFees,id,type,name);
    this.residentialAddress = residentialAddress;
    }
    public void calculateFees(){
         postCourseFees =  postCourseFees/ 6;
    }
    public int getFees(){
        return postCourseFees;
    }

}
class Main{
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5,"OOP",16000
        ,1001,'D', "Manu", "No 32/3 Vijayanagar");
        System.out.println("Course ID: "+dayScholar.getPostCourseId());
        System.out.println("Course Name: "+dayScholar.getPostCourseName());
        dayScholar.calculateFees();
        System.out.println("Semester fees: " +dayScholar.getFees());
        System.out.println("Student Name: "+dayScholar.studentName);
        System.out.println("Student Id: "+dayScholar.studentId);
        System.out.println("Student type: "+dayScholar.studentType);
    }
}