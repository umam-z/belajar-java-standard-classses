package zuper.progammer.classes;

public class NomerApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "100.10";

        Double contohInteger = Double.valueOf(contoh);
        System.out.println(contohInteger);
    }
}
