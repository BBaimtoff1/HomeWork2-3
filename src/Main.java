public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObjects("Apple"), createObjects("Samsung"),
         createObjects("Redmi")};
        for (Printable printable:printables) {
            printable.print();

        }

        }



    public static Printable createObjects (String className){
        switch (className){
            case "Apple":
                return new Apple("суперЧип", "реалистичнаяКамера",
                        "яркийДисплей", "Mini");
            case "Samsung":
                return new Samsung(167, 1080, 7000, 60);

            case "Redmi":
                return new Redmi("big", "powerCamera", 6, "Blue");
        }

        return null;
    }
}
