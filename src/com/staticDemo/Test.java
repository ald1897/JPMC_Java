package com.staticDemo;

import com.utilities.Constants;

public class Test {
    public static void main(String[] args) {
        User u1 = new User(1,1);
        User u2 = new User(2,2);
        System.out.println(u1.getUserId());
        System.out.println(u1.getCount());
        User u3 = new User(3,3);
        User u4 = new User(4,4);
        System.out.println(User.getCount());

        Constants c1 = new Constants();
        System.out.println(c1);

    }
}
