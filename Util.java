import java.text.NumberFormat;
import java.util.Locale;

class Util {
    public static String formatRupiah(double amount) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(amount);
    }
}
