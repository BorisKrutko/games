package LW6;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class MyCollection{
    ArrayList<Student> collectioStudents = new ArrayList<Student>();

    public MyCollection (File fName){
        try{
            String str;
            String[] tokens;
            Scanner scanner = new Scanner(fName);
            while (scanner.hasNextLine()) {
                str = scanner.nextLine();
                tokens = str.split(" ");
                collectioStudents.add(new Student(tokens));
            }
        } catch(Exception e) {System.out.println("file not found");}
    }

    public String toString() {
        String resStr = "";
        for (Student tempStudent : this.collectioStudents) {
            resStr += "idNumber: " + tempStudent.getIdNumber() + "; " + "surname: " 
            + tempStudent.getSurname() + "; " + "groupNumber: " + tempStudent.getGroupNumber() + "; " 
            + "courseNumber: " + tempStudent.getCourseNumber();
        }
        return resStr;
    }
}
