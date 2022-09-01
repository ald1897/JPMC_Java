// packages are structures to organize your code
// reverse of the url
// package is the 1st statement in a file
package com.jpmc;
// database => customerDB, productDB
// utilities => birthday => year =>
// service => BL
// class names every word 1st letter should be caps - HelloWorld
// the filename is exactly same as the class name which is public
// loose coupling and high cohesiveness
// File => cannot read and write , create
// FileReader
// FileWriter
// DFD, UML
public class HelloWorld {
    //main is the entry point of your application
    public static void main(String[] args) {
        // prints whatever you write in ""
        System.out.println("Hello World"+1);
        System.out.print("welcome");
        System.out.println("Result "+(1+2));// \n
        System.out.println(1+2+" yeahh");
    }
}
// if a class is not public it is NOT accessible to classes in other package
class Test{

}
