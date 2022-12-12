import java.util.Scanner;
public class task1 {

    //    Вывести все простые числа от 1 до 1000
    public static void main(String[] args) {
        String list = " ";
        int i = 2;
        int j = 0;
        int num = 1000;
        int t = num;
        while (i * i <= t) {
            while (t % i == 0) {
                t = t / i;
                list = list + ' ' + i;
            }
            i += 1;
        }
        if (list.length() == 1) {
            list += num;
        }
        else{
            if(t != 1) {
                list = list + ' ' + t;
            }
        }
        System.out.println(list);
    }
    }



