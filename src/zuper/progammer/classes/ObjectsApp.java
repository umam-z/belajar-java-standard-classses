package zuper.progammer.classes;

import java.util.Objects;

public class ObjectsApp {
    public static class Data {
        String data;

        public Data(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((data == null) ? 0 : data.hashCode());
            return result;
        }
        
        public String toString() {
            return "Data { data=" + data + " }";
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Data other = (Data) obj;
            if (data == null) {
                if (other.data != null)
                    return false;
            } else if (!data.equals(other.data))
                return false;
            return true;
        }
    }

    public static void main(String[] args) {
        execute(new Data(null));
    }

    public static void execute(Data data) {
        
        System.out.println(Objects.toString(data));
        System.out.println(Objects.hashCode(data));

    }
}
