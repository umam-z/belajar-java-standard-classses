package zuper.progammer.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Mohammad Sirajul Umam Zuper Programmer";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            String names = matcher.group();
            System.out.println(names);
        }
    }
}
