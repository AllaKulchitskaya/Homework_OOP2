import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        System.out.println(maxim);
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        System.out.println(anya);
        Human katya = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        System.out.println(katya);
        Human artem = new Human("Артём", "Москва", 1995, "директор по развитию бизнеса");
        System.out.println(artem);
        Human vladimir = new Human("Владимир", "Казань", 2001, "");
        System.out.println(vladimir);

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59);
        System.out.println(rose);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        System.out.println(chrysanthemum);
        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        System.out.println(peony);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(gypsophila);
        Bouquet bouquet = new Bouquet(new Flower[]{rose, rose, rose, gypsophila, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum, chrysanthemum});
        bouquet.calculateBouquetCost();
        int minBouquetLifeSpan = bouquet.findBouquetLifeSpan();
        System.out.println("Срок стояния букета - " + minBouquetLifeSpan);


        Car lada = new Car("Lada", "Granta", 1.7, "", 2015, "Россия",
                "МКПП", "седан", "к549ву178", 0, true,
                new Car.Key(false, false), new Car.Insurance(null, 7_000,
                "326435268"));
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                "Германия", "АКПП", "седан", "", 4, false,
                new Car.Key(true, true), new Car.Insurance(null, 6_000,
                "729461085"));
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия",
                "", "хэтчбэк", "р254пр136", 6, true,
                new Car.Key(true, false), new Car.Insurance(null, 0, "936406573"));
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018,
                "Южная Корея", "АКПП", "", "", 4, false,
                new Car.Key(false, true), new Car.Insurance(null, 9_000, ""));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "МКПП", "седан", "а976мс162", 4,
                true, new Car.Key(false, false), new Car.Insurance(null,
                7_500, ""));
        System.out.println(hyundai);

        boolean result = hyundai.IsRegistrationNumberCorrect();
        System.out.println(result);
        audi.changeTyres();
    }
}