package formatter;

import java.text.NumberFormat;

public class NumberFormatDemo2 {
    public static void main(String[] args) {
        double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();

        System.out.print("Максимальное количество знаков в дробной части "
                + nf.getMaximumFractionDigits() + ": ");
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(7);
        System.out.print("Максимальное количество знаков в дробной части 7: ");
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(2);
        System.out.print("Максимальное количество знаков в целой части 2: ");
        System.out.println(nf.format(d));
    }
}
