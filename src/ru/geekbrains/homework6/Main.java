package ru.geekbrains.homework6;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try{
            FileOutputStream fos = new FileOutputStream("text.txt");
            fos.write("Привет, как дела?".getBytes());
            fos.close();

            FileOutputStream fos2 = new FileOutputStream("text2.txt");
            fos2.write("Ты самый лучший!".getBytes());
            fos2.close();

            FileInputStream fis = new FileInputStream("text.txt");
            System.out.println(fis.read());
            fis.close();



        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
