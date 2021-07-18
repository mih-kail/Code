// считывание с консоли в файл

package com.mihkail;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("res.txt")))
        {

        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
