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

    static void task2(int a, int b, int c) {
        System.out.println(a * 100 + b * 10 + c);
    }
        public static void main (String[]args){
            //Написать метод, аргументами которого являются 4 числа (1- делитель, остальные 3 - делимое). Определить
            // какие и сколько чисел, делятся на делитель нацело.
            dividerFunc(2, 8, 6, 7);
            task2(1 , 2 , 3);
        }

}
