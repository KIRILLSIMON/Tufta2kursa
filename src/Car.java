import java.time.LocalDate;

public class Car { private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gears;
    private final String body;
    private final String number;
    private int seats;
    private boolean summerTyres;
    private Key key;
    private Insurance insurance;



    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry)
    if(brand ==null||brand.isEmpty()){
        brand = "default";
    }
        this.brand =brand;

        if(model ==null){
        model = "default";
    }
        this.model =model;
    setEngineVolume(engineVolume);
        this.color =color;
        if(productionYear< 0){
        productionYear = 2000;
    }
        this.productionYear =productionYear;
        if(productionCountry ==null){
        productionCountry = "default";
    }
        this.productionCountry =productionCountry;
        if(body ==null||body.isEmpty()){
        body = "седан";
    }this.body =body;
        if(number ==null||number.isEmpty()){
        number = "x000x000";
    }
        this.number =number;
    setKey(null);
    setInsurance(null);
}

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry) {
        this(brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                null,
                null
        );
    }


    public Key getKey(){
        return key;


        public void setKey(Key key){
            if (key == null) {
                key = new Key(false, false);
            }
            this.key=key;
        }

        public Insurance getInsurance() {
            return insurance;
        }
        public void setInsurance(Insurance insurance){
            if (insurance == null) {
                insurance = new Insurance(null, 10_000, null)
            }
            this.insurance=insurance;

            public String getBrand() {return brand;}
            public String getModel() {return model;}
            public int getProductionYear() {return productionYear;}
            public String getProductionCountry() {return productionCountry;}
            public String getBody(){return body;}
            public String getNumber() {return number;}
            public String getEngineVolume(){return engineVolume;}
            public void setEngineVolume(double engineVolume) {
                if (Double.compare(engineVolume, 0D) == 0) {
                    engineVolume = 1.5;
                }
                this.engineVolume = engineVolume;
            }
            public String getColor() {return color;}
            public void setColor(String color) {
                this.color = color;
            }
            public String getGears() {return gears;}
            public void setGears(String gears) {

                if (gears == null || gears.isEmpty()) {
                    gears = "МКПП";
                }
                this.gears = gears;
            }

            public int getSeats() {return seats;}
            public void setSeats(int seats) {
                if (seats <= 0) {
                    seats = 5;
                }
                this.seats = seats;
            }
            public boolean isSummerTyres() {
                return summerTyres;
            }

            public void setSummerTyres(boolean summerTyres) {this.summerTyres = summerTyres;
            }

            public void changeTyres() {
                setSummerTyres(!summerTyres);
            }

            public boolean isValidNumber() {

                return number.length() == 9
                        && Character.isLetter(number.charAt(0))
                        && Character.isLetter(number.charAt(4))
                        && Character.isLetter(number.charAt(5))

                        && Character.isDigit(number.charAt(1))
                        && Character.isDigit(number.charAt(2))
                        && Character.isDigit(number.charAt(3))
                        && Character.isDigit(number.charAt(6))
                        && Character.isDigit(number.charAt(7))
                        && Character.isDigit(number.charAt(8));
            }

            @Override
            public String toString() {
                return "Car{" +
                        "brand='" + brand + '\'' +
                        ", model='" + model + '\'' +
                        ", engineVolume=" + engineVolume +
                        ", color='" + color + '\'' +
                        ", productionYear=" + productionYear +
                        ", productionCountry='" + productionCountry + '\'' +
                        ", gears='" + gears + '\'' +
                        ", body='" + body + '\'' +
                        ", number='" + number + '\'' +
                        ", seats=" + seats +
                        ", summerTyres=" + summerTyres +
                        '}';
            }

            public void print() {System.out.println(this);}

            public static class Key {

                private final boolean remoteRun;

                private final boolean withoutKeyAccess;

                public Key(boolean remoteRun, boolean withoutKeyAccess) {
                    this.remoteRun = remoteRun;
                    this.withoutKeyAccess = withoutKeyAccess;
                }

                public boolean isRemoteRun() {
                    return remoteRun;
                }

                public boolean isWithoutKeyAccess() {
                    return withoutKeyAccess;
                }

            }
            public static class Insurance{

                private final LocalDate expireDate;
                private final int cost;
                private final String number;

                public Insurance(LocalDate expireDate, int cost, String number) {...}
            if (expireDate==null){
                    expireDate=LocalDate.now().plusDays(365);
                }
            this.expireDate = expireDate;
            if(cost<=0){
                    cost=10_000;
                }
            this.cost = cost;
            if (number==null||number.isEmpty()){
                    number="ooosssttt";
                }
            this.number = number;
            }
            public void printCheckExpired(){
                boolean isExpired= expireDate.isAfter(LocalDate.now());
                if(isExpired){
                    System.out.println("Страховка проСРАЧена!!!");
                }
            }
            public void printCheckNumber(){
                boolean correct=number.length()==9;
                if (!correct){
                    System.out.println(" НОМЕР СТРАХОВКИ-НЕКОРРЕКТЕН!");
                }
            }

            public LocalDate getExpireDate() {
                return expireDate;
            }

            public int getCost() {
                return cost;
            }

            public String getNumber() {
                return number;
            }
        }
}
