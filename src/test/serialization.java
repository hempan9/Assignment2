package test;

import java.io.*;
import java.security.PublicKey;

public class serialization {
    public static void main(String[] args) {
/*//Creating object from class student
        try{
        Students students = new Students(211,"Ravi");
        FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.flush();
        objectOutputStream.close();

    }catch (Exception e){
            System.out.println(e);
}*/
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Students s=(Students)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }}
class Students implements Serializable {
    int id;
    String name;
    public Students(int id, String name){
        this.id = id;
        this.name= name;
    }

}
