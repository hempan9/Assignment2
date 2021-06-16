package test;

public class cons {
    public static void main(String[] args) {
        Student s;
        s= new Student();
        System.out.println(s.getStudentName());
        System.out.println(s.getStudentId());
        Student ss = new Student(111,"Balaram Pyakuryal",'I');
       // System.out.println(ss.getStudentId()+" "+ss.getStudentName()+" "+ss.getStudentStatus());
        ss.setStudentId(50); ss.setStudentName("Bale"); ss.setStudentStatus('F');
        System.out.println(ss.getStudentId()+" "+ss.getStudentName()+" "+ss.getStudentStatus());

    }
}
