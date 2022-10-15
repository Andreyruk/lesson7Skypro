public class Main {
    public static void main(String[] args) {
        // Домашнее задание 7
        System.out.println("Домашнее задание 7");
        { // Задача 1
            // С помощью цикла for выведите в консоль все числа от 1 до 10.
            System.out.println("Задача 1");
            for (int i = 1; i <= 10; i++) {System.out.println (i);}
        }
        { // Задача 2
            // С помощью цикла for выведите в консоль все числа от 10 до 1.
            System.out.println("Задача 2");
            for (int i = 10; i > 0; i--) {System.out.println (i);}
        }
        { // Задача 3
            // Выведите в консоль все четные числа от 0 до 17.
            System.out.println("Задача 3");
            for (int i = 0; i < 17; i=i+2) {System.out.println (i);}
        }
        { // Задача 4
            // Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
            System.out.println("Задача 4");
            for (int i = 10; i >= -10; i--) {System.out.println (i);}
        }
        { // Задача 5
            // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
            // В консоль результат должен выводиться в формате "… год является високосным".
            // (по моему if... - с такими данными, лишнее условие)
            System.out.println("Задача 5");
            for (int year = 1904; year <= 2096; year+=4) {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                }
            }
        }
        { // Задача 6
            // Напишите программу, которая выводит в консоль последовательность цифр:
            // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
            System.out.println("Задача 6");
            for (int i = 7; i <= 98; i+=7) {
                System.out.print (i +" ");}
            System.out.println();
        }
        { // Задача 7
            // Напишите программу, которая выводит в консоль последовательность цифр:
            // 1 2 4 8 16 32 64 128 256 512
            System.out.println("Задача 7");
            for (int i = 1; i <= 512; i=i*2) {
                System.out.print (i + " ");}
            System.out.println();
        }
        { // Задача 8
            // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
            // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
            System.out.println("Задача 8");
            int salary = 29_000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum += salary; // равно (sum = sum + salary)
                System.out.println ("Месяц "+ i +", сумма накоплений равна "+ sum +" рублей");
            }
        }
        { // Задача 9 (вариант1)
            // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых.
            // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
            System.out.println("Задача 9 (вариант1)");
            int salary = 29_000;
            int total = 0;
            int percentInYear = 12;
            int percentInMonth = percentInYear / 12;
            System.out.println("Ставка в банке "+ percentInMonth + "% в месяц");
            for (int i = 1; i <= 12; i++) {
                total = total + (total * percentInMonth / 100);
                total = total + salary;
                System.out.println ("Месяц "+ i +", сумма накоплений равна "+ total +" рублей");
            }
        }
        { //Задача 9 (вариант2)
            // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых.
            // Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
            System.out.println("Задача 9 (вариант2)");
            double salary = 29_000;
            double total = 0;
            double percentInYear = 0.12;
            double percentInMonth = percentInYear / 12;
            System.out.println("Ставка банка "+ percentInMonth + " в месяц");
            for (int i = 1; i <= 12; i++) {
                total = total + (total * percentInMonth);
                total = total + salary;
                System.out.println ("Месяц "+ i +", сумма накоплений равна "+ total +" рублей");
            }
        }
    }
}