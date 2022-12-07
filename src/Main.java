public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
       int age = 20;
       if (age >= 18) {
           System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
       } else {
           System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
       }
       }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 8;
        if (temperature >= 5) {
            System.out.println("На улице тепло " + temperature + " \u00B0C , можно идти без шапки.");
        } else {
            System.out.println("На улице холодно " + temperature + " \u00B0C, нужно надеть шапку.");

        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то вы нарушаете ПДД и придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то вы ничего не нарушаете и можете ездить спокойно.");
        }
        }

    public static void task4() {
        System.out.println("Задача 4");
        int ageOfThePerson = 22;
        if (ageOfThePerson >= 2 && ageOfThePerson <= 6) {
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад.");
        }
        else if (ageOfThePerson >= 7 && ageOfThePerson <= 18){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        }
        else if (ageOfThePerson >= 19 && ageOfThePerson <= 24){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университет.");
        }
        else if (ageOfThePerson >= 25){
            System.out.println("Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int ageKid = 15;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то он не может кататься на аттракционе.");
        } else if (ageKid >= 5 && ageKid <= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageKid > 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то он может кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalNumberOfSeats = 88;
        int numberOfSeats = 60;
        int numberOfStandingPlaces = totalNumberOfSeats - numberOfSeats;
        if (totalNumberOfSeats <= 60){
            System.out.println("Вагоне есть сидячие и стоячие места.");
        }
        else if (totalNumberOfSeats > numberOfSeats && totalNumberOfSeats <= 102) {
            System.out.println("В вагоне остались только стоячие места.");
        }
        else if (totalNumberOfSeats > 102) {
            System.out.println("К сожалению вагон уже полностью заполнен - мест нет!.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 27;
        int tree = 15;
        if (one > two && one > tree) {
            System.out.println("Переменная one имеет самое большое значение");
        }
        else if (two > one && two > tree) {
            System.out.println("Переменная two имеет самое большое значение");
        }
            else if (tree > one && tree > two) {
            System.out.println("Переменная tree имеет самое большое значение");
        }
    }
    }