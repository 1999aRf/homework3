public class Main {
    public static void main(String[] args) {
        // 1 Задание
        int firstName = 100000;
        System.out.println("Значение переменной firstName с типом int равно " + firstName);
        byte secName = 100;
        System.out.println("Значение переменной secName с типом byte равно " + secName);
        short thirdName = 1000;
        System.out.println("Значение переменной thirdName с типом short равно " + thirdName);
        long forName = 1000000000L;
        System.out.println("Значение переменной forName с типом long равно " + forName);
        float fiveName = 5.8389286f;
        System.out.println("Значение переменной fiveName с типом float равно " + fiveName);
        double sixName = 10.1035809372015781f;
        System.out.println("Значение переменной sixName с типом double равно " + sixName);

        //2 Задание
        float apple = 27.12f;
        long brome = 987678965549L;
        float cfbsd = 2.786f;
        short dsbdf = 569;
        short esbdf = -159;
        int ffgdn = 27897;
        byte gfghm = 67;

        //3 Задание
        byte firstTeacher = 23;
        byte secTeacher = 27;
        byte thirdTeacher = 30;
        short totalNumberOfSheets = 480;
        int studentBody = 0;
        int result = 0;
        studentBody = firstTeacher + secTeacher + thirdTeacher;
        result = totalNumberOfSheets / studentBody;
        System.out.println(result);
        //Я не понял почему нужно указывать переменную studentBody как int?

        //4 Задание
        byte productivityTwoMinutes = 16;
        int productivityOneMinutes = productivityTwoMinutes / 2;
        int productivityTwentyMinutes = productivityOneMinutes * 20;
        System.out.println("За 20 минут машина произвела " + productivityTwentyMinutes + " штук бутылок");
        int productivityOneDay = productivityTwentyMinutes * 3 * 12;
        System.out.println("За день машина произвела " + productivityOneDay + " штук бутылок");
        int productivityThreeDays = productivityOneDay * 3;
        System.out.println("За 3 дня машина произвела " + productivityThreeDays + " штук бутылок");
        int productivityOneMonth = productivityThreeDays * 10;
        System.out.println("За месяц машина произвела " + productivityOneMonth + " штук бутылок");

        //5 Задание
        int whiteColor = 2;
        int brownColor = 4;
        int summaColor = 120;
        int classRoom = 0;
        classRoom = summaColor / (whiteColor + brownColor);
        whiteColor = whiteColor * classRoom;
        brownColor = summaColor - whiteColor;
        System.out.println("В школе, где " + classRoom + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски");

        //6 Задание
        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        float weight = 0f;
        weight = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);
        System.out.println(weight + " гр");
        weight = (weight / 1000);
        System.out.println(weight + " кг");

        //7 Задание
        int target = 7;
        short firstVariant = 250;
        short secVariant = 500;
        int daysFor250gr = 0;
        int daysFor500gr = 0;
        int meanValue = 0;
        target = target * 1000;
        daysFor250gr = target / firstVariant;
        System.out.println(daysFor250gr + " дней понадобиться, чтобы сбросить 250 грамм");
        daysFor500gr = target / secVariant;
        System.out.println(daysFor500gr + " дней понадобиться, чтобы сбросить 500 грамм");
        meanValue = (daysFor250gr + daysFor500gr) / 2;
        System.out.println(meanValue + " день в среднем понадобиться чтобы скинуть 7 кг");

        //8 Задание
        int ZPMasha = 67760;
        int ZPDenis = 83690;
        int ZPKristina = 76230;
        int yearZPMasha = ZPMasha * 12;
        System.out.println(yearZPMasha);
        int yearZPDenis = ZPDenis * 12;
        int yearZPKristina = ZPKristina * 12;
        int variance = 0;
        ZPMasha = ZPMasha / 10 + ZPMasha;
        variance = ZPMasha * 12 - yearZPMasha;
        System.out.println("Маша теперь получает " + ZPMasha + " рублей. Годовой доход вырос на " + variance + " рублей");

        ZPDenis = ZPDenis / 10 + ZPDenis;
        variance = ZPDenis * 12 - yearZPDenis;
        System.out.println("Денис теперь получает " + ZPDenis + " рублей. Годовой доход вырос на " + variance + " рублей");

        ZPKristina = ZPKristina / 10 + ZPKristina;
        variance = ZPKristina * 12 - yearZPKristina;
        System.out.println("Кристина теперь получает " + ZPDenis + " рублей. Годовой доход вырос на " + variance + " рублей");

    }
    }