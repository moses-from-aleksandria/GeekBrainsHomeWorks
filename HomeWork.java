import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Второе задание: типы данных");
        byte a2 = 127  ;
        short b2 = 12442 ;
        int c2 = 2147483647;
        long d2 = 400000L ;
        float e2 = 15.55f ;
        double g2 = 25.25 ;
        char j2 = 'd';
        boolean e = false;

        System.out.println("Третье задание: Вычисление выражения a * (b + (c / d))");
        System.out.println("Введите число a");
        int a3 = sc.nextInt();
        System.out.println("Введите число b");
        int b3 = sc.nextInt();
        System.out.println("Введите число с");
        int c3 = sc.nextInt();
        System.out.println("Введите чмсло d");
        int d3 = sc.nextInt();
        System.out.println("Результат равен : " + exercise3.calculate(a3,b3,c3,d3));

        System.out.println("Четвертое задание: проверить что сумма двух чисел лежит в диапозоне от 10 до 20");
        System.out.println("Введите первое число");
        int a4 = sc.nextInt();
        System.out.println("Введите второе число");
        int b4 = sc.nextInt();
        System.out.println(exercise4.calculate20(a4,b4));

        System.out.println("Пятое задание: положительное или отрицательное число");
        System.out.println("Введите любое число, можно отрицательное!!");
        int a5 = sc.nextInt();
        System.out.println(exercise5.Negative(a5));

        System.out.println("Шестое задание: если число отрицательное выведется значение true");
        System.out.println("Введите любое число, можно отрицательное!!");
        int a6 = sc.nextInt();
        System.out.println(exercise6.Negative(a6));

        System.out.println("7 задание: универсальное приветствие");
        System.out.println("Как вас зовут?");
        String a7 = sc.next();
        System.out.println("Привет, "+ a7 +"!!!");

        System.out.println("Восьмое задание: определение високосного года:");
        System.out.println("Введите год");
        int a8 = sc.nextInt();
        System.out.println(exercise8.year(a8));









    }

}
