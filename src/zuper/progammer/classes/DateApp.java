package zuper.progammer.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal = new Date();
        System.out.println(tanggal);

        /**
         * untuk mengurangi dan menambah waktu gunakan fungsi add
         * dengan parameter pertama adalah jenis waktu yang ingin dimanipulasi
         * dan parameter kedua adalah interval waktu pengurangan. misal 10 tahun
         * dari sekarang jika menggunakan minus berarti mengurangi
         * calender.add(Calendar.YEAR, -10);
         * output: jika sekarang tahun 2020 dikurangi 10 tahun akan menjadi 
         * 2010
         */
        Calendar calender = Calendar.getInstance();
        calender.set(calender.YEAR, 2000);
        calender.set(calender.MONTH, calender.NOVEMBER);
        calender.set(calender.HOUR_OF_DAY, 15);

        // untuk mengkonversi ke Date
        Date result = calender.getTime();
        System.out.println(result);
    }
}
