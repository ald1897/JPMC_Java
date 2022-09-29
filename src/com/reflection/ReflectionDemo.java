package com.reflection;

//Reflection allows you to get the info of the built in classes created either created by you or someone else


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Load the class
        Class str = Class.forName("java.lang.String");
        String s = new String("blah");
        Class str1 = s.getClass();
        Class str2 = String.class;

        System.out.println(str.getName());
        System.out.println(str.getModifiers());
        System.out.println(str.getSuperclass());

        Class c1 = Child.class;
        System.out.println(c1.getSuperclass());

        Class driver = Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println(driver.getName());

        Method[] methods = c1.getDeclaredMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
            int mod = method.getModifiers();
            System.out.println(Modifier.toString(mod));
            System.out.println(method.getReturnType());
        }

    }
}

class Parent {
    public boolean p1() {
        return true;
    }
}


class Child extends Parent {


}