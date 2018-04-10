package com.ecvictor.selenium.cucumber.whitelist.modules;

import java.util.Random;

public class GenerateEmail {

    public static String getEmailString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        saltStr += "@gmail.com";
        return saltStr;
    }
}
