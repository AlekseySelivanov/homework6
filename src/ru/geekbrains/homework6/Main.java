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


            InputStream in1 = new FileInputStream("text.txt");
            byte[] buffer = new byte[1 << 20];
            OutputStream os = new FileOutputStream(new File("text3.txt"), true);
            int count;
            while ((count = in1.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
            in1.close();

            in = new FileInputStream("text2.txt");

            while ((count = in.read(buffer)) != -1) {
                os.write(buffer, 0, count);
                os.flush();
            }
            in.close();
            os.close();

        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
