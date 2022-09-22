package com.staticDemo;

/**
 * 1. static is an access modifier
 * 2. can be applied only on the memebers of the class and not the local variables
 * 3. static members do not have access to this keyword
 * 4. static members cannot access other non static members
 * 5. non-static members can access static membersdirectly
 * 6. static members are accessed dierctly on the class name and object of the class is not required
 * 7. stati members are shared between objects of the class
 */
public class User {
    private int userId;
    private static int count;

    public User(int userId, int count) {
        this.userId = userId;
        this.count = count;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public static int getCount() {
        return count;
    }


}
