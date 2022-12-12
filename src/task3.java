import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

//Реализовать простой калькулятор
public class task3 {

    public static void main(String[] args) {
        while (true)
        {
            String[] rt = new String[]{""};
            String ext = " ";


            Scanner iScanner = new Scanner(System.in);
            System.out.print("Введите выражение разделяя элементы пробелами: ");
            String str = iScanner.nextLine();

            rt = str.split(" "); //получаем распарсиную строку
            ext = rt[0]; // проверяем условие выхода

            if (ext.charAt(0) != '0') {
                double num1 = Double.parseDouble(rt[0]);
                double num2 = Double.parseDouble(rt[2]);

                ext = rt[1];
                switch (ext.charAt(0)) {
                    case '+' -> {
                        double sum = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + sum);
                    }
                    case '-' -> {
                        double sub = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + sub);
                    }
                    case '*' -> {
                        double mul = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + mul);
                    }
                    case '/' -> {
                        if(num2 != 0)
                        {
                            double div = num1 / num2;
                            System.out.println(num1 + " / " + num2 + " = " + div);
                        }
                        else
                        {
                            System.out.println("*На ноль делить нельзя!*");
                        }
                    }
                    default -> System.out.println("Это мы не умеем! ");
                }
            } else {
                System.out.println("*****ПОКА!*****");
                iScanner.close();
                break;
            }

        }

    }
}

