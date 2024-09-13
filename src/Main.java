public class Main {
    public static void main(String[] args) {
        int int1 = -2147483648;
        byte byte1 = 127;
        short short1 = -32768;
        long long1 = 9223372036854775807L;
        float float1 = 13.666f;
        double double1 = 13.666;


        double double2 = 27.12;
        long long2 = 987678965549L;
        String string1 = "2,786";
        short short2 = 569;
        short short3 = -159;
        short short4 = 27897;
        byte byte2 = 67;

        System.out.println("Задача 3");
        int sheetsPerStudent = 480/(23+27+30);
        // не сказано инициировать все переменные ¯\_(ツ)_/¯
        // не ясно, делят ли листы по частям на учеников и нужно ли использовать double
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println();
        System.out.println("Задача 4");

        int productivityPerMinute = 16 / 2;
        int minutesPerDay = 60 * 24;
        int minutesPer3Days = 60 * 24 * 3;
        int minutesPerMonth = 60 * 24 * 31;
        int productivityPer20Minutes = productivityPerMinute * 20;
        int productivityPerDay = productivityPerMinute * minutesPerDay;
        int productivityPer3Days =  productivityPerMinute * minutesPer3Days;
        int productivityPerMonth =  productivityPerMinute * minutesPerMonth;
        System.out.println("За 20 минут машина произвела " + productivityPer20Minutes + " штук бутылок");
        System.out.println("За день машина произвела " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");

        System.out.println();
        System.out.println("Задача 5");

        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalClasses = 120 / (whitePaintPerClass + brownPaintPerClass);
        int totalWhitePaint = whitePaintPerClass * totalClasses;
        int totalBrownPaint = brownPaintPerClass * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и "
                + totalBrownPaint + " банок коричневой краски");

        System.out.println();
        System.out.println("Задача 6");

        int  bananasWeight = 5 * 80;
        int  milkWeight = 200 / 100 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int totalWeightGr = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double totalWeightKg = (double) totalWeightGr / 1000;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGr);
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKg);

        System.out.println();
        System.out.println("Задача 7");

        int daysMin = 7000 / 500;
        int daysMax = 7000 / 250;
        double daysAverage = (double) (daysMax + daysMin) / 2;
        System.out.println("На похудение, если спортсмен будет терять каждый день по 250 грамм уйдет " + daysMax + " дней");
        System.out.println("На похудение, если спортсмен будет терять каждый день по 500 грамм уйдет " + daysMin + " дней");
        System.out.println("В среднем на похудение уйдет " + daysAverage + " дней");

        System.out.println();
        System.out.println("Задача 8");

        int mashaBeforeIncrease = 67760;
        int denisBeforeIncrease = 83690;
        int krisBeforeIncrease = 76230;
        double mashaAfterIncrease = 67760 * 1.1;
        double denisAfterIncrease = 83690 * 1.1; //откуда взялись малые доли при умножении?
        double krisAfterIncrease = 76230 * 1.1;
        double mashaIncreaseYear = (mashaAfterIncrease - mashaBeforeIncrease) * 12;
        double denisIncreaseYear = (denisAfterIncrease - denisBeforeIncrease) * 12;
        double krisIncreaseYear = (krisAfterIncrease - krisBeforeIncrease) * 12;
        System.out.println("Маша теперь получает " + mashaAfterIncrease + " рублей. Годовой доход вырос на " + mashaIncreaseYear + " рублей");
        System.out.println("Денис теперь получает " + denisAfterIncrease + " рублей. Годовой доход вырос на " + denisIncreaseYear + " рублей");
        System.out.println("Кристина теперь получает " + krisAfterIncrease + " рублей. Годовой доход вырос на " + krisIncreaseYear + " рублей");


















    }
}