package com.demo;

import com.demo.entity.Course;
import com.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 3 types of maven repositories
 * 1. central repository
 * 2. local repository => .m2 (it fetched jar files from remote or central repo
 * MAC -> Users => .m2 [ cmd+shift+.]
 * Windows -> C:/Users/Window user/.m2
 * 3. Remote repo => organization specific =>
 *
 * super or parent or effective pom
 *
 * src/main/java => source code
 * src/main/resources => production related configuration
 * src/test/java => test cases
 * src/test/resources => testing related configuration
 * archetype => like your word template that provides with some predefined structure
 * group id : package name
 * artifact id : project name
 * version
 */
public class App 
{
    public static void main( String[] args )
    {
        // set the context of my application => load all the beans and instantiate them
        // load the configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        System.out.println( "beans loaded" );
      //  Student s1 = context.getBean(Student.class);
//        Student s1 = (Student)context.getBean("s1");
//        System.out.println(s1);
//
        Student s2 = (Student)context.getBean("s2");
        System.out.println(s2);

        // scoping => is singleton only 1 instance per applciaiton
        Course course1 = context.getBean(Course.class);
        course1.setCourseName("Core Java 8");
        System.out.println(course1.getCourseName());//

        Course course2 = context.getBean(Course.class);
        System.out.println(course2.getCourseName());//

    }
}
