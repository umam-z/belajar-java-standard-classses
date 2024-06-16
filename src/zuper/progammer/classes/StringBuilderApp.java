package zuper.progammer.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        /**
         * string di java sifatnya imutable (tidak dapat dirubah) ketika kita ingin
         * mengubah contoh: 
         * 
         * String name = "moh.";
         * String name = name + " " + "sirajul ";
         * String name = name + " " + "umam";
         * 
         * output: moh. sirajul umam
         * 
         * Sebenarnya di java ia akan membuat tiga data di memory yaitu:
         * moh.
         * moh. sirajul
         * moh. sirajul umam
         * 
         * ketika ingin memanipulasi string dengan jumlah banyak tidak disarankan
         * menggunakan string langsung. mengingat sifat string yang akan menguras
         * banyak sekali sumberdaya. solusinya ialah dengan menggunakan StringBuilder
         * dan StringBuffer
         * 
         * perbedaan StringBuilder dan StringBuffer ialah: StringBuilder threadSafe sedangkan StringBuffer tidak
         * oleh karena itu StringBuffer lebih lambat tapi bisa digunakan untuk pararel programming.
         */
        StringBuilder builder = new StringBuilder();
        builder.append("moh.");
        builder.append(" ");
        builder.append("sirajul");
        builder.append(" ");
        builder.append("umam");

        String name = builder.toString();
        System.out.println(name);
    }
}
