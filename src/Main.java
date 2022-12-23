import java.time.LocalDate;

public class Main { public static void main(String[] args) {
    Human maksim=new Human(
            2022-35,
            "Максим",
            "Минск",
            "брэнд-менеджер"
    );

    Human anya=new Human(
            2022-29,
            "Аня",
            "Москва",
            "методист образ. программ"

    );

    Human katya=new Human(
            LocalDate.now().getYear()-28,
            "Катя",
            "Калининград",
            "продакт-менеджер"

    );

    Human artem=new Human(
            2022-27,
            "Артём",
            "Москва",
            "директор по развитию бизнеса"
    );
    Human Vovan=new Human(
            2022-21,
            "Vova",
            "KAZAN",
            "unworked"
    );

    System.out.println( maksim);
    System.out.println(anya);
    System.out.println(katya);
    System.out.println(artem);
    Vovan.print();


    Car lada= new Car(
            "Lada",
            "Grand",
            1.7,
            "жёлтый",
            2015,
            "Russika"

    );
    lada.print();

    Car Porshe= new Car(
            "Porshe",
            "Kayen",
            1.7,
            "жёлтый",
            2015,
            "Франция"
    );
    Porshe.print();

    Car Audi= new Car(
            "Audi",
            "A8 50 L TDI quattro",
            3.0,
            "чёрный",
            2020,
            "Germany"

    );
    Audi.print();

    Car BMW= new Car(
            "BMW",
            "Z8",
            1.7,
            "чёрный",
            2015,
            "Germany"


    );
    BMW.print();

    Car Kia= new Car(
            "Kia",
            "Sportage 4 поколения",
            2.4,
            "чёрный",
            2015,
            "Южная Корея"

    );
    Kia.print();

    Car Hyndai= new Car(
            "Hyndai",
            "Avante",
            1.6,
            "оранжевый",
            2016,
            "Южная Корея"

    );
    Hyndai.print();

    Flower rosa = new Flower(
            "роза",
            "Голландия",
            35.99
    );

    Flower hrizantema = new Flower(
            "хризантема",
            "Голландия",
            15
    );
    hrizantema.setLifeSpan(5);

    Flower pion = new Flower(
            "пион",
            "UK",
            69.9
    );
    pion.setLifeSpan(1);
    Flower hipsofila = new Flower(
            "гипсофила",
            "Turkey",
            69.9
    );
    hipsofila.setLifeSpan(10);



        /*printInfo(new Flower[]{rosa});
        printInfo(new Flower[]{hrizantema});
        printInfo(new Flower[]{pion});
        printInfo(new Flower[]{hipsofila});*/
    Bouquet bouquet= new Bouquet(
            new Flower[]{
                    new Flower("роза", "Голландия",35.59),
                    new Flower("роза", "Голландия",35.59),
                    rosa,

                    new Flower("хризантема", "Голландия",15),
                    new Flower("хризантема", "Голландия",15),
                    new Flower("хризантема", "Голландия",15),
                    new Flower("хризантема", "Голландия",15),
                    hrizantema,
                    hipsofila
            }
    );
    bouquet.printInfo();

}
}
