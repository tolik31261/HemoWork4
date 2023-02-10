public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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

    public static void task4() {
        System.out.println("Задача 4");
        int ageKindergarten = 6;
        if (ageKindergarten >= 2 && ageKindergarten <= 7) {
            System.out.println("Если человеку " + ageKindergarten + " лет, то ему нужно ходить в детский сад.");
        } else {
            System.out.println("Если человеку " + ageKindergarten + " лет, то ему не нужно ходить в детский сад.");
        }

        int ageSchool = 15;
        if (ageSchool >= 8 && ageSchool <= 18) {
            System.out.println("Если человеку " + ageSchool + " лет, то ему нужно ходить в школу.");
        } else {
            System.out.println("Если человеку " + ageSchool + " лет, то ему не нужно ходить в школу.");
        }

        int ageUniversity = 21;
        if (ageUniversity >= 19 && ageUniversity <= 24) {
            System.out.println("Если человеку " + ageUniversity + " лет, то ему нужно ходить в университет.");
        } else {
            System.out.println("Если человеку " + ageUniversity + " лет, то ему не нужно ходить в университет.");
        }

        int ageWork = 25;
        if (ageWork > 24) {
            System.out.println("Если человеку " + ageWork + " лет, то ему нужно ходить на работу.");
        } else {
            System.out.println("Если человеку " + ageWork + " лет, то ему не нужно ходить на работу.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int childAge = 10;
        boolean hasAdult = true;
        if (childAge < 5) {
            System.out.println("Ребенок не может кататься на атракционе.");
        } else if (childAge >= 5 && childAge < 14 && hasAdult) {
            System.out.println("Если возраст ребенка " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge >= 5 && childAge < 14 && !hasAdult) {
            System.out.println("Если возраст ребенка " + childAge + ", то ему нельзя кататься на аттракционе без сопровождения взрослого.");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка " + childAge + ", то ему можно кататься на аттракционе.");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int place = 11;
        if (place >= 1 && place<=60) {
            System.out.println("Ваше место " + place + " - сидячее.");
        } else if (place >= 61 && place <= 120) {
            System.out.println("Ваше место " + place + " - стоячее.");
        } else {
            System.out.println("Мест в вагоне нет.");
        }

    }
}
