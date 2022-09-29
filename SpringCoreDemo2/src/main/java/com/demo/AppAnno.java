package com.demo;

import com.demo.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnno
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-anno.xml");
        System.out.println( "beans loaded" );
        Student s1 = context.getBean(Student.class);
        System.out.println(s1);

    }
}
