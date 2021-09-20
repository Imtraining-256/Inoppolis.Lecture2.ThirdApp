import java.math.BigDecimal;

/**
 * Class for experimentation
 */
public class Main {
    /**
     * Method for experimentation
     * @param args array args
     */
    public static void main(String[] args) {

        String hello = "Hello";
        String word = "word";

        int someInteger = 10;

        double firstDouble = 1.0001;
        double secondDouble = 1.000099999999;

        BigDecimal one = new BigDecimal(firstDouble);
        BigDecimal two = new BigDecimal(secondDouble);

        StringBuilder builder  = new StringBuilder(hello + " " + word);

        builder.replace(6,10,"Java");

        System.out.println((one.compareTo(two)));

        System.out.println(builder);
    }
}

