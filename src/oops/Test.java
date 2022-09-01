package oops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // b1 is an object of type Box
//        Box b1 = new Box(5,5,5);
//        // assign values for the dimensions
//        System.out.println("volume: " + b1.calcVolume());
//
//        Box b2 = new Box(2,3,4);
//        // assign values for the dimensions
//         System.out.println("Volume  "+ b2.calcVolume());

//        Scanner s1 = new Scanner(System.in);
//
//        System.out.println("Product ID: ");
//        int id = Integer.valueOf(s1.nextLine());
//
//        System.out.println("Product Name: ");
//        String name = s1.nextLine();
//
//        System.out.println("Price: ");
//        double price = Double.valueOf(s1.nextLine());
//
//        System.out.println("Product Description: ");
//        String description = s1.nextLine();
//
//        System.out.println("Discount: " );
//        double discount = Double.valueOf(s1.nextLine());
//
//        Product p1 = new Product(id, name, price, description);
//        System.out.println(p1);
//
//
//
            Scanner s1 = new Scanner(System.in);

            System.out.println("Name: ");
            String name = s1.nextLine();

            System.out.println("Email: ");
            String email = s1.nextLine();

            System.out.println("Phone: ");
            String phone = s1.nextLine();

            System.out.println("Password: ");
            String password = s1.nextLine();

            Address a1 = new Address("Haddonfield", "USA", "Grove St", "", "", "Museum");
            Customer c1 = new Customer(name, email, phone, password, a1);
            System.out.println(c1);
            Address addr = c1.getAddress();
            addr.setCity("Camden");
            System.out.println(c1);


    }
}
