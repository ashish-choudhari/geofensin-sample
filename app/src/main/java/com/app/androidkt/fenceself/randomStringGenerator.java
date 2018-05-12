package com.app.androidkt.fenceself;

/**
 * Created by Ashish on 5/12/2018.
 */

import java.util.UUID;

public class randomStringGenerator {
    public static void main(String[] args) {
        System.out.println(generateString());
    }

    private static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return "uuid = " + uuid;
    }
}