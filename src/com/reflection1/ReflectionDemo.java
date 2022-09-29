package com.reflection1;

import com.mysql.cj.jdbc.Driver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Parent {
    private String name;
    public void p1()
    {

    }
}
class Child extends  Parent{
    public int id;
    public void c1(){}
}
// refection => get the information of the in-built classes or the ones created either by you or someone else
public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException {
        // Load the class
        Class str = Class.forName("java.lang.String");
        String s = new String("hello");
        Class str1 = s.getClass();
        Class str2 = String.class;

        System.out.println(str.getName());
        System.out.println(str.getModifiers());
        System.out.println(str.getSuperclass());

        Class c1 = Child.class;
        System.out.println(c1.getSuperclass());


        Class driver = Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(driver.getName());

        // Methods :
       // Method[] methods = c1.getDeclaredMethods();
        Method[] methods = c1.getMethods();
        for(Method method : methods)
        {
            System.out.println();
            System.out.println(method.getName());
            int modifier = method.getModifiers();
            System.out.println(Modifier.toString(modifier));
            System.out.println(method.getReturnType());
        }

        // fields
        Field[] fields = c1.getFields();
        for(Field field : fields)
        {
            System.out.println();
            System.out.println(field.getName());

        }
        Field id = c1.getDeclaredField("id");
        id.setAccessible(true);
        id.setInt(c1, 10);
        System.out.println(id.get(c1));
    }
}
