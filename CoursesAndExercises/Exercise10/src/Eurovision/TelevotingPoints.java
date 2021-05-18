package Eurovision;

import java.io.IOException;
import java.util.Arrays;

public class TelevotingPoints {

    public static void main(String[] args) throws IOException {

        if (args.length != 12)
            throw new IllegalArgumentException("Expecting 12 arguments (year, country and 10 country votes");

        String year = args[0];
        String country = args[1];

        String[] countryPoints = Arrays.copyOfRange(args, 2, 12);

        JuryPoints.savePoints(year, country, countryPoints);
    }
}
