package com.demo;

import com.demo.entity.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//replacement of xml file -> spring configurations
@Configuration // AppConfig represents all spring related configuration
// <context:component-scan
// going to scan the root and the sub packages for spring related annotation classes
// and load them , instantiate them
@ComponentScan//(basePackages = "entity")
public class AppConfig
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println( "beans loaded" );
        Student s1 = context.getBean(Student.class);
        System.out.println(s1);

    }
}
