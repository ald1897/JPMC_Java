package com.jdbc1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.jdbc1.Student.change;

public class Test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        //DBConn.getConnection();
//        Student s1 = new Student(3,"payal","payal@gmail.com","5656565656");
//        StudentDatabase sd = new StudentDatabase();
//       // System.out.println(sd.insertStudent(s1));
//
//        Student s2 = new Student(5,"Ruhan","ruhan@gmail.com","234343434");
//        System.out.println(sd.insertStudentWithPS(s2));
//
//       System.out.println(sd.updateStudentWithPS("Ruhan Gupta", 4));
//       System.out.println(sd.deleteStudentWithPS(4));
//        System.out.println(sd.getStudentById(1));
//        for(Student student:sd.getStudents())
//            System.out.println(student);
        List<String> list = new ArrayList<>(Arrays.asList("Apples", "Oranges", "Banana"));

        change(list);

        System.err.println(list);

//    }
    }
}
