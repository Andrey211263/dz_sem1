import java.util.Scanner;

// Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
// заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить
// выражение до верного равенства. Предложить хотя бы одно решение или сообщить,
// что его нет.
public class task4 {
    public static void main(String[] args) {
        String str = "2a + b5 = 91";
        String[] rt = str.split(" ");

        int sum = Integer.parseInt(rt[4]);
        String num1 = rt[0];
        String num2 = rt[2];
        char x = num1.charAt(0);
        char y = num2.charAt(1);
        int a = x - '0';  //выделяем 2 из 2а -ое число
        int b = y - '0';  //выделяем 5 из b5 -ое число
        int x1 = a *10 + b;
        int z = sum - x1;
        if (z > 9 && z < 100) {
            a = a * 10 + z % 10;
            b = (int) Math.floor(z / 10) * 10 + b;
            System.out.println("Наше выражение: " + a + " + " + b + " = " + sum);
        }
        else
        {
            System.out.println("решения для выражения >> " + str + " << нет");
        }


    }
}