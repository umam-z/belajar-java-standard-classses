package zuper.progammer.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("moh");
        joiner.add("sirajul");
        joiner.add("umam");

        String value = joiner.toString();
        System.out.println(value);
    }
}
