package com.regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        /**
        Matcher
        Pattern
        Quantifiers
         metacharacters \\d \\s \D \w

         Quantifiers
         * .+@.+
         ? 0 or 1
         + 1 or more
         . single
         * 0 or more

         */

        Pattern p = Pattern.compile(".s");
        //Matcher m = p.matcher("pas"); // false
        Matcher m = p.matcher("as"); // true
        System.out.println(m.matches());

       // p = Pattern.compile(".?s");
        p = Pattern.compile(".+s");
        //m = p.matcher("as"); // true
        m = p.matcher("dfghjkfghj5678s"); // truea
        System.out.println(m.matches());

        p = Pattern.compile(".+@.+");
        //m = p.matcher("as"); // true
        m = p.matcher("shalinimittal@"); // truea
        System.out.println(m.matches());
        System.out.println();
        p = Pattern.compile("\\d");
        //m = p.matcher("as"); // true
        m = p.matcher("1345678");
        System.out.println(m.matches());
        System.out.println();
        p = Pattern.compile("\\d{3}");
        m = p.matcher("134");
        System.out.println(m.matches());
        System.out.println();
        p = Pattern.compile("[A-Za-z0-9._]+");
        m = p.matcher("shalini10.mittal");
        System.out.println(m.matches());

        System.out.println();
        p = Pattern.compile("[AEIOU]");
        m = p.matcher("AE");
        System.out.println(m.matches());

        System.out.println();
        p = Pattern.compile("[AEIOU][A-Z]+");
       // m = p.matcher("AEGSAHKJDUE");
        m = p.matcher("GSAHKJDUE");
        System.out.println(m.matches());

        System.out.println();
        p = Pattern.compile("[^AEIOU][A-Z]+");
        // m = p.matcher("AEGSAHKJDUE");
        m = p.matcher("GSAHKJDUE");
        System.out.println(m.matches());

        System.out.println();
        p = Pattern.compile("[9.][0-9]{10}");
        // m = p.matcher("AEGSAHKJDUE");
        m = p.matcher("91676767676");
        System.out.println(m.matches());

        System.out.println();
        p = Pattern.compile("[AEIOU]*[A-Z]+");
        // m = p.matcher("AEGSAHKJDUE");
        m = p.matcher("AAAAAAGSAHKJDUE");
        System.out.println(m.matches());


    }
}
