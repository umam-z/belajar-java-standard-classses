package zuper.progammer.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }
    }
}
