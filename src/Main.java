public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int ageHuman = 14;

        if (ageHuman < 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ", он не достиг совершеннолетия, нужно немного подождать.");
        } else {
            System.out.println("Ему " + ageHuman + " он достиг совершеннолетия"); }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 5;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Сегодня холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф.");
        }

    }
}
