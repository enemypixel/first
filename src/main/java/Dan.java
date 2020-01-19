import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Dan {


    static void dividerFunc(int divider, int a, int b, int c) {
        int u = 0;
        if (a % divider != 0) {
            System.out.println(a + "/" + divider + " не делится");
        } else {
            System.out.println(a + "/" + divider + " делится");
            u++;
        }
        if (b % divider != 0) {
            System.out.println(b + "/" + divider + " не делится");
        } else {
            System.out.println(b + "/" + divider + " делится");
            u++;
        }
        if (c % divider != 0) {
            System.out.println(c + "/" + divider + " не делится");
        } else {
            System.out.println(c + "/" + divider + " делится");
            u++;
        }
        System.out.println(u);
    }

    static int digtsCount(int num) {
        return num > 0 ? (int) (Math.log10(num) + 1) : 1;
    }

    static int[] intToDigits(int num) {
        int count = digtsCount(num);
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            int base = (int) Math.pow(10, (count - i - 1));
            result[i] = num / base;
            num -= base * result[i];
        }
        return result;
    }

    static int task2Ex(int num) {
        int[] digits = intToDigits(num);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }

    static void task2(int a, int b, int c) {
        System.out.println(a * 100 + b * 10 + c);
    }

    static boolean isSquare(int a, int b, int c, int d) {
        if (a == b && c == d && a != c) {
            return false;
        }
        if (a == b && b == c && c == d) {
            return true;
        } else {
            throw new IllegalArgumentException("Not a square or rectangle");
        }
    }

    static void task4(double x1, double y1, double x2, double y2) {
        double d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        System.out.printf("sqrt(%.3f) = %.3f%n", d, Math.sqrt(d));
    }

    static void task5(int a, int b, int c) {
        if (a * a * b * b == c * c) {
            System.out.println("a b c - тройка пифагора");
        } else {
            System.out.println("eror");
        }
    }

    static int promptForInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt + " :");
                Scanner ss = new Scanner(System.in);
                String input = ss.next();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("You entered not a number");
            }
        }
    }


    static void task6() {
        int num = promptForInt("Enter num");
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", num, i, num * i));
        }
    }

    static void task7() {
        int a = 5;
//        int a = promptForInt("Enter number");
        int mass[];
        mass = new int[a];
        for (int i = 0; i < a; i++) {
            mass[i] = i + 1;
        }
        int sum = 0;
        int mult = 1;
        for (int num : mass) {
            if (num % 2 == 0) {
                System.out.println(num + " - Чётный");
                sum = sum + num;
            } else {
                System.out.println(num + " - Не чётный");
                mult = mult * num;
            }
        }

        System.out.println("Сумма - " + sum + ", Прозведение - " + mult);
    }
    public static void task9() {
        System.out.println("Выберите пукт (отрицательно число меняет местами величины");
        System.out.println("1 : цельсий - фаренгейт");
        System.out.println("2 : сантиметры - дюймы");
        System.out.println("3 : километры - мили");
        System.out.println("4 : верста - аршин");
        System.out.println("5 : килограм - фунты");
        System.out.println("6 : литры - галлоны");
        int Convert = promptForInt("Выберите конвертер");
        int Num = promptForInt("Введите число");
        if (Convert == 1) {
            System.out.println((Num * 9 / 5) + 32);
        }
        if (Convert == -1) {
            System.out.println((Num - 32) * 5/9);
        }
        if (Convert == 2) {
            System.out.println((Num / 2.54));
        }
        if (Convert == -2) {
            System.out.println((Num * 2.54));
        }
        if (Convert == 3) {
            System.out.println((Num / 1.609));
        }
        if (Convert == -3) {
            System.out.println((Num * 1.609));
        }
        if (Convert == 4) {
            System.out.println((Num * 194.139));
        }
        if (Convert == -4) {
            System.out.println((Num * 194.139));
        }
        if (Convert == 5) {
            System.out.println((Num * 2.205));
        }
        if (Convert == -5) {
            System.out.println((Num / 2.205));
        }
        if (Convert == 6) {
            System.out.println((Num / 3.785));
        }
        if (Convert == -6) {
            System.out.println((Num * 3.785));
        }
        if (Convert <-6){
            System.out.println("Такого конвертера нет");
        }
        if (Convert >6){
            System.out.println("Такого конвертера нет");
        }
        if (Convert == 0){
            System.out.println("Такого конвертера нет");
        }
    }
    public static void main(String[] args) {
//        //Написать метод, аргументами которого являются 4 числа (1- делитель, остальные 3 - делимое). Определить
//        // какие и сколько чисел, делятся на делитель нацело.
////        dividerFunc(2, 8, 6, 7);
////        task2(1, 2, 3);
////        task3(4, 4, 4, 4);
//        task4(1,2,3,4);
////        task5(2, 4, 8);
//        //System.out.println("You entered :" + promptForInt("Enter number"));
//        task2(1, 2, 3);
//        System.out.println(task2Ex(123));
////        System.out.println(Arrays.toString(intToDigits(0)));
//        //task6();
////        task7();
        //task8(50, 10);
        //task8(23, 10);
        task9();

    }

    private static void task8(int a, int b) {
        if (a % b == 0) {
            System.out.println("частное - " + a / b);
        } else {
            System.out.println("остаток - " + a % b);
        }
    }

    static String name(int age) {
        if (age == 0) {
            return "Baby";
        }

        if (age < 14) {
            return "Bobby";
        }

        return "Bob";
    }


}