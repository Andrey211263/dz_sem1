/*
1. Напишите метод, который вернет содержимое текущей папки в виде массива строк.
2. пишите метод, который запишет массив, возвращенный предыдущим методом в файл.
3. Оработайте ошибки с помощью try-catch конструкции. В случае возникновения
исключения, оно должно записаться в лог-файл.
*/

import java.beans.Expression;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import javax.sound.midi.Patch;
import java.io.FileWriter;
import java.util.logging.*;

public class file {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(file.class.getName());
        logger.setLevel(Level.INFO);
        try {
            FileHandler ch = new FileHandler("log.log", true);
            logger.addHandler(ch);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логирование");
        }
        catch (IOException e) {

        }




        String new_lines;

        new_lines = readlines();
        System.out.println(new_lines);
        writelines(new_lines, logger);
    }

    public static String readlines() {

        try {
            String line = "";
            File dirs = new File(
                    "J:\\Java\\lesson1\\dz_sem1\\src");
            for (File file : dirs.listFiles()) {
                if (file.isFile()) {
                    line = line + file.getName() + "\n";
                }
            }

            return line;
        }
        // catch () {
        // e.printStackTrace();
        // }
        finally {
        }
    }

    public static void writelines(String line, Logger logger) {

        try
        {
            FileWriter fl = new FileWriter("file01.txt");
            fl.write(line);
            fl.close();
        }
        catch (IOException e)
        {
            logger.log(null, line, e);
        }

    }



}






//public class file {
//    public static void main(String[] args) {
//
//        String line = "empty";
//        try {
//            File dirs = new File("J:\\Java\\lesson1\\dz_sem1\\src");
//
//
//            for (File file : dirs.listFiles())
//            {
//                if (file.isFile()){
//                    System.out.println(file.getName());
//                }
//            }
//
//
//
//
//        }
//        // catch () {
//        //     e.printStackTrace();
//        // }
//        finally {
//            System.out.println(line);
//        }
//    }
//    public static srring (String[] args) {
//
//    }
//}