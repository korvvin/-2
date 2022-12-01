public class Main {
    public static void main(String[] args) {
        //task 1:


        System.out.println("task 1:");
        int someOne = 1231231;
        byte help = 100;
        short me = 1000;
        long i = -1241241241;
        float am = 4.3242323423f;
        double stuck = 345345.45645;
        System.out.println("значение переменной someOne c типом int = " + someOne);
        System.out.println("значение переменной help c типом byte = " + help);
        System.out.println("значение переменной me c типом short = " + me);
        System.out.println("значение переменной i c типом long = " + i);
        System.out.println("значение переменной am c типом float = " + am);
        System.out.println("значение переменной stuck c типом double = " + stuck);


        //task 2:


        double one = 27.12;
        long two = 987678965549l;
        byte three = 2;
        short four = 786;
        boolean five = false;
        short six = 569;
        short seven = -159;
        int eight = 27897;
        char nine = 67;


        //task 3


        System.out.println("task 3:");
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short allPaper = 480;
        int allClass = classAS + classEA + classLP;
        int paper = allPaper / allClass;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");


        //task 4


        System.out.println("task 4:");
        int bottle = 16;
        int minute = 2;
        System.out.println("За 2 минуты машины произвела бутылок " + bottle + " штук ");
        int minute20 = minute * 10;
        bottle *= 10;
        System.out.println("За 20 минут машины произвела бутылок " + bottle + " штук ");
        int day = 24 * minute20 * 3;
        bottle *= 24 * 3;
        System.out.println("За день машины произвела бутылок " + bottle + " штук ");
        int day3 = day * 3;
        bottle *= 3;
        System.out.println("За 3 дня машины произвела бутылок " + bottle + " штук ");
        int month = day3 * 10;
        bottle *= 10;
        System.out.println("За месяц машины произвела бутылок " + bottle + " штук ");


        //task 5


        System.out.println("task 5:");
        byte allCollar = 120;
        byte white = 2;
        byte brown = 4;
        int mix = white + brown;
        int class1 = allCollar / mix;
        int allBrown = class1 * brown;
        int allWhite = class1 * white;
        System.out.println("В школе, где " + class1 + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");


        //task 6


        System.out.println("task 6:");
        byte banana = 5;
        byte grBanana = 80;
        short milk = 200;
        int grMilk = 105 / 100;
        byte iceCream = 2;
        byte grIceCream = 100;
        byte egg = 4;
        byte grEgg = 70;
        int sumGr = (banana * grBanana) + (milk * grMilk) + (iceCream * grIceCream) + (egg * grEgg);
        float sumKl = sumGr / 1000f;
        System.out.println("вес (количество грамм) такого спорт-завтрака = " + sumGr);
        System.out.println("В килограммах = " + sumKl);


        //task 7


        System.out.println("task 7:");
        byte goal = 7;
        int goalGr = goal * 1000;
        short min = 250;
        short max = 500;
        int midl = (min + max) / 2;
        System.out.println("лайтовая диета будет длится " + goalGr / min + " дней");
        System.out.println("сушка будет длится " + goalGr / max + " дней");
        System.out.println("в среднем " + goalGr / midl + " дней");


        //task 8


        System.out.println("task 7:");
        int maha = 67760;
        int dan = 83690;
        int kris =76230;
        int mahaNew = maha*10/100+maha;
        int danNew = dan*10/100+dan;
        int krisNew = kris*10/100+kris;
        System.out.println("Маша теперь получает "+mahaNew+" рублей. Годовой доход вырос на "+((mahaNew-maha)*12)+" рублей");
        System.out.println("Денис теперь получает "+danNew+" рублей. Годовой доход вырос на "+((danNew-dan)*12)+" рублей");
        System.out.println("Кристина теперь получает "+krisNew+" рублей. Годовой доход вырос на "+((krisNew-kris)*12)+" рублей");

    }


}