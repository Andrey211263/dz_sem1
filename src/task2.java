import java.util.Scanner;
public class task2 {

    //    Вычислить n-ое треугольного число(сумма чисел от 1 до n),
//    n! (произведение чисел от 1 до n)
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int num = iScanner.nextInt();
        System.out.printf("n-ое треугольного числа %d\n", num);
        iScanner.close();
        int sum = 0;
        for (int i = 0; sum < num; i++) {
            sum = sum + i;


            for (int j = 1; j <= i; j++){

                System.out.printf("%d ", j);

                }
            System.out.println();
        }


        if (sum != num) {
            String res = "число " + num + " не является треугольным";
            System.out.printf(res);
        }
        else {
            double mul = 1;
            for (int i = 1; i <= num; i++) {
                mul = mul * i;
            }
            String res = num+"! = " + mul;
            System.out.printf(res);
            }
        }
        }
