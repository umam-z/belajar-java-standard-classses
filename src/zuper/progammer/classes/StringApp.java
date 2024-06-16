package zuper.progammer.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Moh. Sirajul Umam";
        String nameLowercase = name.toLowerCase();
        String nameUppercase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowercase);
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Moh."));
        System.out.println(name.endsWith("Umam"));

        String[] names = name.split(" ");
        for (String value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(name.charAt(0));

        char[] chars =  name.toCharArray();

        for (char c : chars) {
            System.out.print(c);
        }
    }
}
