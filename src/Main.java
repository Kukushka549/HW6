public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");

        for (int i = 10; i >= 1;i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");

        for (int i = 0; i <=17; i += 2) {
            System.out.println(i);
        }

        System.out.println("Task 4");

        for (int i = 10; i >= -10;i--) {
            System.out.println(i);
        }

        System.out.println("Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("Task 8/9");

        int savings = 0;

        for (int i = 1; i <= 12; i++) {
            savings += savings * 0.01;
            savings += 29000;
            System.out.println("Месяц " + i + ", сумма " + savings);
        }

        System.out.println("Task 10");

        int x = 2;

        for (int i = 1; i <=10; i++) {
            System.out.println(x + "*" + i + "="+ x*i);
        }
    }
}