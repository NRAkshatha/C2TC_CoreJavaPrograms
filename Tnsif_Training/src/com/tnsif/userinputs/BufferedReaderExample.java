package com.tnsif.userinputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name:");
        String name1 = br.readLine();

        System.out.println("Name is: " + name1);
    }
}
