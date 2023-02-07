public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int temperature = 1;
        if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("Сегодня холодно, нужно надеть шапку");
        }
    }
}
