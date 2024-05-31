import java.util.Scanner;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // initialize input scanner
        Scanner input = new Scanner(System.in);

        // initialize variables
        BigInteger n1, n2, n3;

        n1 = BigInteger.valueOf(0);
        n2 = BigInteger.valueOf(1);
        n3 = BigInteger.valueOf(0);

        // get user input
        System.out.println("Enter how many times you want to run the Fibonnaci Sequence: ");
        int count = input.nextInt();

        for (long i = 0; i < count; i++) {

            int comparison = n1.compareTo(BigInteger.valueOf(1000000000000L));

            DecimalFormat df = new DecimalFormat("#,###");
            // Determine if scientific notation is necessary
            if (comparison < 0) {

                BigDecimal d1 = new BigDecimal(n1);

                // print n1
                System.out.println(i + 1 + ": " + df.format(d1));
                
            } else {
                BigDecimal d1 = new BigDecimal(n1);

                String scientificNotation = String.format("%6.30e", d1);

                System.out.println(i + 1 + ": " + scientificNotation);
            }
            // add n1 and n2 to get n3
            n3 = n1.add(n2);

            // Prepare next 2 numbers
            n1 = n2;
            n2 = n3;
        }

        // close input scanner
        input.close();
    }
}