package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        // Regular Expressions
        /**
         * Matcher
         * Pattern
         * Quantifiers
         *  metacharacters
         *  ? 0 or 1
         *  + 1 or more
         * . single
         * 0 or more
         *
         * .+@
         */

        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("pas");

        System.out.println(m.matches());
    }
}
